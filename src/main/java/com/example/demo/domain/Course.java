package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by swethat on 17/7/19.
 */
@Entity
public class Course
{
    @Id
    Integer course_id;
    String name;
}
