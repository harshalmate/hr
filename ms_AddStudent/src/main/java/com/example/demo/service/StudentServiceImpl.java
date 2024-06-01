package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	StudentRepository sr;

	@Override
	public void addStudent(Student s) {
		   sr.save(s);
	}

}
