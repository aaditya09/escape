package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by swethat on 17/7/19.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
