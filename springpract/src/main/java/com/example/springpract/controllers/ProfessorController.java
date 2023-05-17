package com.example.springpract.controllers;

import com.example.springpract.models.Professor;
import com.example.springpract.repo.ProfessorRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepos professorRepos;

    @GetMapping("/professor")
    public String blogMain(Model model){
        Iterable<Professor> professors = professorRepos.findAll();
        model.addAttribute("professors", professors);
        return "professor-main";
    }

    @GetMapping("/professor/add")
    public String blogAdd(Model model){
        return "professor-add";
    }

    @PostMapping("/professor/add")
    public String blogPostAdd(@RequestParam String name, @RequestParam String address, @RequestParam String telNumber,
                              @RequestParam Float salary, Model model){
        Professor professor = new Professor(name, address, telNumber, salary);
        professorRepos.save(professor);
        return "redirect:/professor";
    }
}
