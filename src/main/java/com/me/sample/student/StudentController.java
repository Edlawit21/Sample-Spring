package com.me.sample.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping

    public List<String> findAllStudents() {
        return List.of(
                "may name",
                "hey yall");
    }
}
