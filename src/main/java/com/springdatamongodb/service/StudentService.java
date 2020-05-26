package com.springdatamongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatamongodb.model.Student;
import com.springdatamongodb.respository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student create(Student student) {
		return this.studentRepository.save(student);
	}

	public List<Student> getAll() {
		return this.studentRepository.findAll();
	}

	public Student update(String id, Student student) {
		Student updated = this.studentRepository.findById(id).get();
		updated.setEmail(student.getEmail());
		updated.setName(student.getName());

		return this.studentRepository.save(updated);
	}

	public Student delete(String id) {
		Student student = this.studentRepository.findById(id).get();
		if (student != null)
			this.studentRepository.deleteById(id);
		return student;
	}
}
