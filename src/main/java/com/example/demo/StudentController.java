package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDto;
import com.example.demo.pojo.StudentRequest;
import com.example.demo.response.StudentResponse;
import com.example.demo.response.StudentResponseList;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by swethat on 17/7/19.
 */

@RestController
@RequestMapping("/student")
public class StudentController
{

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void createStudent(@RequestBody Student student)
    {

        studentService.createStudent(student);

    }

    @GetMapping
    public StudentResponseList getAllStudents()
    {
        return studentService.getAllStudents();

    }

    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable Integer id)
    {
           return studentService.getStudentById(id);
    }



}
