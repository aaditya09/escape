package com.example.demo.repository;

import com.example.demo.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Aaditya.t on 18/7/19.
 */

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
