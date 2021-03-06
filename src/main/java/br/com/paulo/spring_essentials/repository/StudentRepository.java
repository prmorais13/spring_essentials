package br.com.paulo.spring_essentials.repository;

import br.com.paulo.spring_essentials.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByNameIgnoreCaseContaining(String name);
}
