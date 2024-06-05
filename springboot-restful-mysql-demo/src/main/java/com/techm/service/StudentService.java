package com.techm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.entity.Student;
import com.techm.exceptions.StudentIdNotFoundException;
import com.techm.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}

	public List<Student> getStudents() {
		return (List<Student>) repository.findAll();
	}

	public Student getStudentById(Integer id) throws StudentIdNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Student> student =  repository.findById(id);
		if(student.isEmpty()) {
			throw new StudentIdNotFoundException("student id not found with : " + id);
		}
		return student.get();
	}

	public void deleteStudentById(Integer id) {
		repository.deleteById(id);
	}

}
