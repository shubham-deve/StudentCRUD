package com.Student.Curd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Curd.Entity.Student;
import com.Student.Curd.Repo.StudentService;
import com.Student.Curd.Repo.StudentServiceImpl;
@RestController
public class StudentController {
	@Autowired
	StudentServiceImpl studentServiceImpl;
	 @PostMapping("/")
	public Student GenerateStudent(@Validated @RequestBody Student student){
		Student s1= this.studentServiceImpl.createStudent(student);
		return s1;
	}
	 @GetMapping("/{StudentId}")
	 public Student getById(@PathVariable int StudentId) {
		 Student s1=this.studentServiceImpl.getStudentById(StudentId);
		 return s1;
	 }
	 @GetMapping("/")
	 public List<Student> getAllStudent(){
		 List<Student> students=this.studentServiceImpl.getAllStudent();
		 return students;
	 }
	 @PutMapping("/{id}")
	 public Student updateStudent(@PathVariable int id,@RequestBody Student student) {
		 Student student2=this.studentServiceImpl.updateStudent(id, student);
		 return student2;
	 }
	 @DeleteMapping("/{id}")
	 public void DeleteStudent(@PathVariable int id) {
		 this.studentServiceImpl.deleteStudent(id);
	 }

}
