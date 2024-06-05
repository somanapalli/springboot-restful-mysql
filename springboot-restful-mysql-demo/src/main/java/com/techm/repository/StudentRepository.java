package com.techm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techm.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
