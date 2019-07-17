package com.example.demo.response;

import com.example.demo.dto.StudentDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Created by swethat on 17/7/19.
 */
@Data
@Builder
public class StudentResponseList
{
    List<StudentDto> studentDtoList;
}
