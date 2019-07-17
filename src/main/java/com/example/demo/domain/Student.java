package com.example.demo.domain;

import com.example.demo.util.Standard;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by swethat on 17/7/19.
 */
@Entity
@Table(name="Student")
@Data
public class Student
{
    @Id
    Integer id;

    @Column
    String name;

    @Column
    String standard;

    @Column
    Long timestamp;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = { @JoinColumn(name = "course_id") })
    Set<Course> courses;
}
