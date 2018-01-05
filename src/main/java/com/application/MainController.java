package com.application;

import com.application.dto.AnInfoDto;
import com.application.dto.NotaStudentDto;
import com.application.dto.StudentInfoDto;
import com.application.entity.Student;
import com.application.repository.StudentRepository;
import com.application.service.StudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path="/student", produces = APPLICATION_JSON_VALUE)
public class MainController {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentService studentService;

	@GetMapping(path="/all")
	public Iterable<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@GetMapping(value = "/{studentId}/info")
	public StudentInfoDto getStudentInfo(@PathVariable Long studentId) throws NotFoundException {
		return studentService.getBasingInfo(studentId);
	}

	@GetMapping(value = "/{studentId}")
	public List<NotaStudentDto> getNoteByStudentIdAndYear(@PathVariable Long studentId,
														  @RequestParam(value = "an") Long an,
														  @RequestParam(value = "semestru") Long semestru) throws NotFoundException {
		return studentService.getNote(studentId, an, semestru);
	}


	@GetMapping(value = "/{studentId}/semestre")
	public List<AnInfoDto> getStudenSemestre(@PathVariable Long studentId) throws NotFoundException {
		return studentService.getSemestreDeStudiu(studentId);
	}

}
