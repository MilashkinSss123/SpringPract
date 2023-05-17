package com.example.springpract.controllers;

import com.example.springpract.models.Student;
import com.example.springpract.repo.StudentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentRepos studentRepos;

    @GetMapping("/student")
    public String blogMain(Model model){
        Iterable<Student> students = studentRepos.findAll();
        model.addAttribute("students", students);
        return "student-main";
    }

    @GetMapping("/student/add")
    public String blogAdd(Model model){
        return "student-add";
    }

    @PostMapping("/student/add")
    public String blogPostAdd(@RequestParam String name, @RequestParam String address, @RequestParam String telNumber,
                              @RequestParam String email, @RequestParam Integer bookNumber, @RequestParam Float avgProgress, Model model){
        Student student = new Student(name, address, telNumber, email, bookNumber, avgProgress);
        studentRepos.save(student);
        return "redirect:/student";
    }
}