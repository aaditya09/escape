package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.response.StudentResponse;
import com.example.demo.response.StudentResponseList;
import com.example.demo.transformer.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by swethat on 17/7/19.
 */
@Service
public class StudentService
{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentTransformer studentTransformer;

    public void createStudent(Student student)
    {
        studentRepository.save(student);

    }

    public StudentResponse getStudentById(Integer id)
    {
        Optional<Student> student = studentRepository.findById(id);
        return StudentResponse.builder().id(id).name(student.get().getName()).courses(student.get().getCourses()).build();

    }


    public StudentResponseList getAllStudents()
    {
        List<Student> studentList = studentRepository.findAll();
        return StudentResponseList.builder().studentDtoList(studentList.stream().map(student -> studentTransformer.getStudentDto(student)).collect(Collectors.toList())).build();
    }
}
