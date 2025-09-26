package com.example.jdbcSpring;

import com.example.jdbcSpring.model.Student;
import com.example.jdbcSpring.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbcSpringApplication {

	public static void main(String[] args) {

        ApplicationContext context =  SpringApplication.run(JdbcSpringApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRollNo(104);
        s.setAge(21);
        s.setName("ankit");

        System.out.println(s);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s);

        Student s1 = context.getBean(Student.class);
        s1.setRollNo(2);
        s1.setAge(22);
        s1.setName("abhinash");

        System.out.println(s1);
        service.addStudent(s1);


        List<Student> students  = service.getStudents();
        System.out.println(students);
	}

}
