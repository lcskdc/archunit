package br.com.archunit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.archunit.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
    List<Student> findByName(String name);
    
}
