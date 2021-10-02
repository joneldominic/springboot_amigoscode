package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L, "Keen", LocalDate.of(1998, 6, 16), 23, "keen@gmail.com"));
	}
}
