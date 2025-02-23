package com.gl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.model.Student;
import com.gl.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	// List<Student> students = new ArrayList<>();

	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	public Optional<Student> getStudentById(Long id) {
		return studentRepo.findById(id);
	}

	public void addStudent(Student student) {
		studentRepo.save(student);
	}

	public void updateStudent(Student student) {
		studentRepo.save(student);
	}

	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
	}

}
