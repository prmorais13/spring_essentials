package br.com.paulo.spring_essentials.service;

import br.com.paulo.spring_essentials.model.Student;
import br.com.paulo.spring_essentials.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //Busca todos
    public Iterable<Student> listAll(){
        return this.studentRepository.findAll();
    }

    //Busca por nome
    public List<Student> studentByName(String name) {
        return this.studentRepository.findByName(name);
    }

    //Busca por ID
    public Student byId(Long id) {
        return this.studentRepository.findOne(id);
    }

    //Salva
    public Student save(Student student) {
        return this.studentRepository.save(student);
    }

    //Exclui
    public void studenteDelete(Long id) {
        this.studentRepository.delete(id);
    }

}
