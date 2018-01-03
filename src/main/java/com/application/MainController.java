package com.application;

import com.application.entity.Student;
import com.application.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/student") // This means URL's start with /demo (after Application path)
public class MainController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Student> getAllStudents() {
		return studentRepository.findAll();
	}
}
