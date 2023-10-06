package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Student;
import com.velocity.repository.StudentRepository;
import com.velocity.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		Student stud = studentRepository.save(student);
		return stud;
	}

}
