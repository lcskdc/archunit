package br.com.archunit.service;

import br.com.archunit.entity.Student;
import br.com.archunit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public Optional<Student> findById(long id) {
        return studentRepository.findById(id);
    }

    public Boolean delete(Student student) {
        studentRepository.delete(student);
        return true;
    }
}
