package com.me.sample.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "abebe",
                        "Beso",
                        LocalDate.now(),
                        "contact@mail.com",
                        34),
                new Student(
                        "abebe",
                        "Beso",
                        LocalDate.now(),
                        "contact@mail.com",
                        34));
    }
}
