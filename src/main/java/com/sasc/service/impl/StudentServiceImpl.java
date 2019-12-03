package com.sasc.service.impl;

import com.sasc.mapper.StudentMapper;
import com.sasc.pojo.Student;
import com.sasc.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    public void add(Student student){
        studentMapper.add(student);
    }
}
