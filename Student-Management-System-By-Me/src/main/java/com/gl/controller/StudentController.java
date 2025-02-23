package com.gl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.model.Student;
import com.gl.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentsvc;

	@GetMapping("/greet")
	public String getGreet() {
		return "Student management project is running.";
	}

	@GetMapping("/allStudent")
	public List<Student> getAllStudents() {
		return studentsvc.getAllStudents();
	}

	@GetMapping("/studentById/{id}")
	public Optional<Student> getStudentById(@PathVariable Long id) {
		return studentsvc.getStudentById(id);
	}

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		studentsvc.addStudent(student);
		return "Student added successfully.";
	}

	@PutMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable Long id, @RequestBody Student updateStudent) {
		updateStudent.setId(id);
		studentsvc.updateStudent(updateStudent);
		return "Student updated successfully.";
	}

	@DeleteMapping("/deleteById/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		studentsvc.deleteStudentById(id);
		return "Student deleted successfully.";
	}

}
