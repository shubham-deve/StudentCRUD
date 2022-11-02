package com.Student.Curd.Repo;

import java.util.List;

import com.Student.Curd.Entity.Student;

public interface StudentService {
	public Student createStudent(Student student);
	public Student updateStudent(int studentId,Student student);
	public Student getStudentById(int studentId);
	public List<Student> getAllStudent();
	public void deleteStudent(int studentId);

}
