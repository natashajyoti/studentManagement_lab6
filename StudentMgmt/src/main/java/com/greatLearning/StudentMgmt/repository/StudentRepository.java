package com.greatLearning.StudentMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.StudentMgmt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
