package com.Student.Curd.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.Curd.Entity.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer> {

}
