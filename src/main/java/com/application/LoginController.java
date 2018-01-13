package com.application;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.application.dto.StudentDto;
import com.application.entity.Student;
import com.application.repository.StudentRepository;
import com.application.service.StudentService;

import javassist.NotFoundException;

@Controller
public class LoginController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String login(){
		return "login";
	}
	
	@PostMapping("/login")
	public ModelAndView postLogin(@RequestParam String nume,@RequestParam String cnp,ModelMap model, HttpServletResponse response){
		
		StudentDto student = new StudentDto();
		try {
			 student = studentService.getStudentByNumeAndCnp(nume,cnp);

		} catch (NotFoundException e) {

			model.addAttribute("error", true);
			return new ModelAndView("redirect:/", model);
		}
		
		Cookie idCookie = new Cookie("student_id",student.getId().toString());
		response.addCookie(idCookie);
		Cookie numeCookie2 = new Cookie("student_nume",nume);
		response.addCookie(numeCookie2);
		return new ModelAndView("redirect:/catalog", model);
	}
	
	@PostMapping("/logout")
	public ModelAndView delogare(HttpServletResponse response,ModelMap model){

		Cookie idCookie = new Cookie("student_id","");
		idCookie.setMaxAge(0);
		response.addCookie(idCookie);
		Cookie numeCookie2 = new Cookie("student_nume","");
		numeCookie2.setMaxAge(0);
		response.addCookie(numeCookie2);
		return new ModelAndView("redirect:/", model);
	}
}
