package com.springdatamongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatamongodb.model.Student;
import com.springdatamongodb.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> getAll() {
		return this.studentService.getAll();
	}

	@PostMapping
	public Student create(@RequestBody Student student) {
		return this.studentService.create(student);
	}

	@PutMapping(value = "/{id}")
	public Student update(@PathVariable("id") String id, @RequestBody Student student) {
		return this.studentService.update(id, student);
	}

	@DeleteMapping(value = "/{id}")
	public Student delete(@PathVariable("id") String id) {
		return this.studentService.delete(id);
	}

}
