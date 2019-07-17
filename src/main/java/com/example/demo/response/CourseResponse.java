package com.example.demo.response;

import com.example.demo.dto.CourseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;

/**
 * Created by Aaditya.t on 18/7/19.
 */

@Data
@Builder
public class CourseResponse {
    private CourseDto courseDto;

}
