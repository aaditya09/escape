package com.example.demo.transformer;

import com.example.demo.domain.Course;
import com.example.demo.dto.CourseDto;
import org.springframework.stereotype.Component;

/**
 * Created by Aaditya.t on 18/7/19.
 */

@Component
public class CourseTransformer {
    public CourseDto getCourseDto(Course course){
        return CourseDto.builder()
                .id(course.getCourse_id())
                .name(course.getName())
                .build();
    }
}
