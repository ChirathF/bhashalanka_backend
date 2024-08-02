package com.bhashalanka.test.practical_backend.service;

import com.bhashalanka.test.practical_backend.entity.Course;
import com.bhashalanka.test.practical_backend.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    private List<Course> getAllCourses(){
        return courseRepository.findAll ();
    }

    private Optional<Course> findCourseByName (String courseName){
        return courseRepository.findByCourseName (courseName);
    }

    private Course saveCourse (@RequestBody Course request){
        Course course = new Course (request.getCourseName (),request.getDepartment (),request.getFee ());
        Course createdCourse = courseRepository.save (course);
        return createdCourse;
    }
}
