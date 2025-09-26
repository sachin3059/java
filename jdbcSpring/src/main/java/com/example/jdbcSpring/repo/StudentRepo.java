package com.example.jdbcSpring.repo;


import com.example.jdbcSpring.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(Student s) {
        System.out.println("added");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
