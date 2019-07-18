package com.example.demo.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created by Aaditya.t on 18/7/19.
 */

@Data
@Builder
public class CourseListResponse {
    List<CourseResponse> courses;
}
