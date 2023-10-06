package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Student;
import com.velocity.service.StudentService;

@RestController
public class StudentRestController {
@Autowired
	private StudentService studentService;

@PostMapping("/saveStudent")
public Student saveStudent(@RequestBody Student student) {
	Student stud=studentService.saveStudent(student);
	return stud;
	
}
}
