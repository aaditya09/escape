package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by swethat on 17/7/19.
 */
@Entity
@Data
public class Course
{
    @Id
    Integer course_id;

    @Column
    String name;
}
