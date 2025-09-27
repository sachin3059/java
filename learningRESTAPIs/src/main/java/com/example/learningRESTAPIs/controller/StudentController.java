package com.example.learningRESTAPIs.controller;


import com.example.learningRESTAPIs.dto.StudentDto;
import com.example.learningRESTAPIs.entity.Student;
import com.example.learningRESTAPIs.repository.StudentRepository;
import com.example.learningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController// because we return json from here
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDto> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
}
