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

import com.application.entity.Student;
import com.application.repository.StudentRepository;

@Controller
public class LoginController {
	
	

	@GetMapping("/")
	public String login(){
		return "login";
	}
	
	@PostMapping("/login")
	public ModelAndView postLogin(@RequestParam String nume,@RequestParam String cnp,ModelMap model, HttpServletResponse response){
		
		String student_id="1";
		String student_nume="test";
		if (false){
			
			model.addAttribute("error", true);
			return new ModelAndView("redirect:/", model);
		}
		
		Cookie idCookie = new Cookie("student_id",student_id);
		response.addCookie(idCookie);
		Cookie numeCookie2 = new Cookie("student_nume",student_nume);
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
