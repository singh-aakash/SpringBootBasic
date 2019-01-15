package com.cg.employee.rest.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.employee.rest.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
