package com.example.demo.dto;

import com.example.demo.domain.Course;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * Created by swethat on 17/7/19.
 */

@Data
@Builder
public class StudentDto
{
    Integer id;
    String name;
    Set<Course> courses;
}
