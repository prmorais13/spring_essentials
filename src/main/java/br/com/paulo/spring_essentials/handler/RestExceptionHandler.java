package br.com.paulo.spring_essentials.handler;

import br.com.paulo.spring_essentials.error.ResourceNotFounException;
import br.com.paulo.spring_essentials.error.ResourceNotFoundDetails;
import br.com.paulo.spring_essentials.error.ValidationErrorDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;
import java.util.List;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFounException.class)
    public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFounException rfnException) {
        ResourceNotFoundDetails rnfDetails = ResourceNotFoundDetails.builder
                .newBuilder()
                .date(new Date())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Resource not found")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getName())
                .build();
        return new ResponseEntity<>(rnfDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handlerMethodArgumentNotValidException(MethodArgumentNotValidException manvException) {
        List<FieldError> fieldErrors = manvException.getBindingResult().getFieldErrors();
        System.out.println();

        ValidationErrorDetail rnfDetails = ValidationErrorDetail.builder
                .newBuilder()
                .date(new Date())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Resource not found")
                .detail(manvException.getMessage())
                .developerMessage(manvException.getClass().getName())
                .build();
        return new ResponseEntity<>(manvException, HttpStatus.NOT_FOUND);
    }
}
