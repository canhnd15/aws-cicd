package com.anhdevchiase.controller;

import com.anhdevchiase.dto.CourseReq;
import com.anhdevchiase.dto.CourseResp;
import com.anhdevchiase.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController (CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<?> addCourse(@RequestBody CourseReq req) {
        return new ResponseEntity<>(courseService.addCourse(req), HttpStatus.CREATED);
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<?> getAllCourses() {
        List<CourseResp> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}
