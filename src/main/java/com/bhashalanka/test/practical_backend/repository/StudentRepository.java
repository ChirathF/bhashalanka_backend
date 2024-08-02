package com.bhashalanka.test.practical_backend.repository;

import com.bhashalanka.test.practical_backend.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
