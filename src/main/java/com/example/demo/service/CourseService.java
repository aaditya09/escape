package com.example.demo.service;

import com.example.demo.domain.Course;
import com.example.demo.dto.CourseDto;
import com.example.demo.repository.CourseRepository;
import com.example.demo.response.CourseResponse;
import com.example.demo.transformer.CourseTransformer;
import exception.CourseNotFoundExecption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import request.CreateCourseRequest;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by swethat on 17/7/19.
 */
@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseTransformer courseTransformer;

    @Autowired
    public CourseService(CourseRepository courseRepository, CourseTransformer courseTransformer) {
        this.courseRepository = courseRepository;
        this.courseTransformer = courseTransformer;
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

    public List<CourseResponse> getAll() {
        return courseRepository.findAll()
                .stream()
                .map(course ->
                    CourseResponse.builder()
                            .courseDto(courseTransformer.getCourseDto(course))
                            .build())
                .collect(Collectors.toList());
    }
}
