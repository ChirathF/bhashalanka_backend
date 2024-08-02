package com.bhashalanka.test.practical_backend.repository;

import com.bhashalanka.test.practical_backend.entity.Course;
import com.bhashalanka.test.practical_backend.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface CourseRepository extends MongoRepository<Course, String> {

    @Query("{ 'courseName' : ?0 }")
    Optional<Course> findByCourseName(String courseName);

}
