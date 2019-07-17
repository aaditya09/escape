package com.example.demo.transformer;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDto;
import org.springframework.stereotype.Component;

/**
 * Created by swethat on 17/7/19.
 */
@Component
public class
StudentTransformer
{
    public StudentDto getStudentDto(Student student)
    {
        return StudentDto.builder().id(student.getId()).name(student.getName()).courses(student.getCourses()).build();
    }
}
