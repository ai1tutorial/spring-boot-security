
package com.spring.boot.security.ai1tutorial.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.security.ai1tutorial.model.Student;

@RestController
@RequestMapping("ai1tutorial/security")
public class StudentController {

	@GetMapping("/test")
	public String sampleGet() {
		return "test SWagger";
	}

	@PostMapping("/student")
	public Student createSample(@Valid @RequestBody Student student) {
		return student;
	}

}
