package com.gl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
