package com.example.springpract.controllers;

import com.example.springpract.models.Course;
import com.example.springpract.repo.CourseRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class CourseController {

    @Autowired
    private CourseRepos courseRepos;

    @GetMapping("/course")
    public String blogMain(Model model){
        Iterable<Course> courses = courseRepos.findAll();
        model.addAttribute("courses", courses);
        return "course-main";
    }

    @GetMapping("/course/add")
    public String blogAdd(Model model){
        return "course-add";
    }

    @PostMapping("/course/add")
    public String blogPostAdd(@RequestParam String name, @RequestParam Integer number, @RequestParam Float price,
                              @RequestParam String professorName, Model model){
        Course course = new Course(name, number, price, professorName);
        courseRepos.save(course);
        return "redirect:/course";
    }
}
