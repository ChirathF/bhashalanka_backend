package com.bhashalanka.test.practical_backend.controller;

import com.bhashalanka.test.practical_backend.entity.Course;
import com.bhashalanka.test.practical_backend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/all")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @GetMapping("/{CourseName}")
    public Optional<Course> getUniversity(@PathVariable String courseName){
        return courseService.findCourseByName(courseName);
    }

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course){
        return courseService.saveCourse (course);
    }



}
