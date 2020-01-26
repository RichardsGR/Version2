package com.sasc.controller;


import com.sasc.pojo.Student;
import com.sasc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/add")
    public String addStudent(@RequestParam("username")String username,@RequestParam("num")String num,@RequestParam("phone")String phone,@RequestParam("qq")String qq, HttpServletRequest request){
        Student st = new Student();
        st.setName(username);
        st.setNum(num);
        st.setPhone(phone);
        st.setQq(qq);
        System.out.println(st.toString());
        studentService.add(st);

        return "redirect:index";
    }

    @RequestMapping("/index")
    public String index(Model model){
        return "index";
    }
}
