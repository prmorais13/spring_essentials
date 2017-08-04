package br.com.paulo.spring_essentials.controller;

import br.com.paulo.spring_essentials.error.CustomErrorType;
import br.com.paulo.spring_essentials.model.Student;
import br.com.paulo.spring_essentials.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentEndPoint {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<?> listAll(){
        return new ResponseEntity<>(this.studentService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<?> getStudentByName(@PathVariable String name) {
        return new ResponseEntity<>(this.studentService.studentByName(name), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        Student student = this.studentService.byId(id);
        if(student == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new CustomErrorType("Student not found!"));
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student) {
        return new ResponseEntity<>(this.studentService.save(student), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> studentUpade(@RequestBody Student student) {
        return new ResponseEntity<>(this.studentService.save(student), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> studenteDelete(@PathVariable Long id) {
        Student student = this.studentService.byId(id);
        if(student == null)
            return new ResponseEntity<>(new CustomErrorType("Student not found!"), HttpStatus.NOT_FOUND);
        this.studentService.studenteDelete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
