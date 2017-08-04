package br.com.paulo.spring_essentials.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFounException extends RuntimeException {

    public ResourceNotFounException(String message) {
        super(message);
    }
}
