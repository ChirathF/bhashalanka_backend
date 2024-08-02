package com.bhashalanka.test.practical_backend.service;

import com.bhashalanka.test.practical_backend.entity.Student;
import com.bhashalanka.test.practical_backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    private List<Student> getAllStudents(){
        return studentRepository.findAll ();
    }

    private Optional<Student> findStudentById(String id){
        return studentRepository.findById (id);
    }

    private Student saveStudent(@RequestBody Student request){
        Student student = new Student (request.getFName (),request.getLName (), request.getBirthDate (),request.getAddress (),request.getContact (),request.getCourse ());
        Student createdStudent = studentRepository.save (student);
        return createdStudent;

    }
}
