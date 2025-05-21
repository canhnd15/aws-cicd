package com.anhdevchiase.service;

import com.anhdevchiase.dto.CourseReq;
import com.anhdevchiase.dto.CourseResp;
import com.anhdevchiase.entity.Course;
import com.anhdevchiase.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService (CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseResp addCourse(CourseReq courseReq) {
        Course course = new Course();
        course.setName(courseReq.getName());
        course.setPrice(courseReq.getPrice());
        course.setTime(courseReq.getTime());
        course.setCreatedDate(LocalDateTime.now());

        course = courseRepository.save(course);

        return new CourseResp(course.getName(), course.getPrice(), course.getTime());
    }

    public List<CourseResp> getAllCourses() {
        return courseRepository.findAll().stream()
                .map((course) -> new CourseResp(course.getName(),
                        course.getPrice(),
                        course.getTime()))
                .toList();
    }
}
