package com.priyank.springwebservicedemo.controller;

import com.priyank.springwebservicedemo.course.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Full stack with Spring Boot and Angular"),
                new Course(2, "Learn Full stack with Spring Boot and React"),
                new Course(3, "Master Microservices with Spring Boot and Spring Cloud"),
                new Course(4, "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"),
                new Course(5, "Learn AWS with Microservices")
        );
    }

}
