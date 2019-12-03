package com.sasc.controller;


import com.sasc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/add")
    public void addStudent(@RequestParam("username")String username){
        System.out.println(username);
    }
}
