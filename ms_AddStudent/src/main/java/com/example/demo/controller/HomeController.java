package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServiceI;

@RestController
public class HomeController {
	@Autowired
	StudentServiceI ssi;
	
    @GetMapping("/get")
	public String addData(@RequestBody Student s) {
    	         ssi.addStudent(s);
		return "Data Added Successfully";
		
	}
}
