package com.ttl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ttl.Interfacee.StudentService;
import com.ttl.entity.Student;
@CrossOrigin("http://localhost:4200")
@RestController
public class MyController {
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/GETStudents")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
		
	}
	@GetMapping("/GETStudents/{id}")
	public Student getStudent(@PathVariable int id){
		return this.studentService.getStudent(id);
	}
		
	@PostMapping("/POSTStudent")
	public Student addStudent(@RequestBody Student s) {
		return this.studentService.addStudent(s);
	}
	
	@PutMapping("/PUTStudent")
	public Student updateStudent(@RequestBody Student s) {
		return this.studentService.updateStudent(s);
	}
	
	@DeleteMapping("/DELETEStudent/{id}")
	public List<Student> deleteStudent(@PathVariable int id) throws Exception
	{
		return this.studentService.deleteStudent(id);
			
	}
	

}
