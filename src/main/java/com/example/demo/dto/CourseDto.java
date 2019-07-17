package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Aaditya.t on 18/7/19.
 */

@Data
@Builder
public class CourseDto {
    private Integer id;
    private String name;
}
