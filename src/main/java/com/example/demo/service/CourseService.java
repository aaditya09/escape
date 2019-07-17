package com.example.demo.service;

import com.example.demo.domain.Course;
import com.example.demo.dto.CourseDto;
import com.example.demo.repository.CourseRepository;
import exception.CourseNotFoundExecption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import request.CreateCourseRequest;

/**
 * Created by swethat on 17/7/19.
 */
@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void create(CreateCourseRequest createCourseRequest) {
        Course course = new Course();
        course.setCourse_id(createCourseRequest.getId());
        course.setName(createCourseRequest.getCourseName());
        courseRepository.save(course);
    }

    public CourseDto get(Integer courseId) throws CourseNotFoundExecption{
        Course course =  courseRepository.findById(courseId)
                .orElseThrow(() -> new CourseNotFoundExecption("No course found for course id : " + courseId));

        return CourseDto.builder()
                .id(course.getCourse_id())
                .name(course.getName())
                .build();
    }
}
