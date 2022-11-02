package com.Student.Curd.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Curd.Entity.Student;
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	public StudentRepo studentRepo;

	@Override
	public Student createStudent(Student student) {
		Student std= this.studentRepo.save(student);
		return std;
	}

	@Override
	public Student updateStudent(int studentId, Student student) {
	Optional<Student> s1=	this.studentRepo.findById(studentId);
	Student student2 = new Student();
	if(s1.isPresent()) {
	 student2=this.studentRepo.save(student);
	}
	return student2;  
	}

	@Override
	public Student getStudentById(int studentId) {
    Optional<Student> s1=this.studentRepo.findById(studentId);
    Student s2=new Student();
    if(s1.isPresent()) {
    	s2=s1.get();
    }
		return s2;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> s1=this.studentRepo.findAll();
		return s1;
	}

	@Override
	public void deleteStudent(int studentId) {
	Optional<Student> s1=this.studentRepo.findById(studentId);
	if(s1.isPresent()) {
		Student s2=s1.get();
		this.studentRepo.delete(s2);
	}
		
	}

}
