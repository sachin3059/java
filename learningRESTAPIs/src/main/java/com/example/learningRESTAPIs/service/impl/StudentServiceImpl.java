package com.example.learningRESTAPIs.service.impl;

import com.example.learningRESTAPIs.dto.StudentDto;
import com.example.learningRESTAPIs.entity.Student;
import com.example.learningRESTAPIs.repository.StudentRepository;
import com.example.learningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtoList = students
                .stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))
                .toList();
        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(Long id){
        return Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with ID: " + id));
    }
}
