package com.anhdevchiase.service;

import com.anhdevchiase.dto.CourseReq;
import com.anhdevchiase.dto.CourseResp;
import com.anhdevchiase.entity.Course;
import com.anhdevchiase.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseResp addCourse(CourseReq courseReq) {
        Course course = Course.builder()
                .name(courseReq.getName())
                .price(courseReq.getPrice())
                .time(courseReq.getTime())
                .createdDate(LocalDateTime.now())
                .build();

        course = courseRepository.save(course);

        return CourseResp.builder()
                .name(course.getName())
                .price(course.getPrice())
                .time(course.getTime())
                .build();
    }

    public List<CourseResp> getAllCourses() {
        return courseRepository.findAll().stream()
                .map((course) -> CourseResp.builder()
                        .name(course.getName())
                        .price(course.getPrice())
                        .time(course.getTime())
                        .build())
                .toList();
    }
}
