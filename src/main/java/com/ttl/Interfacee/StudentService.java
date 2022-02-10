package com.ttl.Interfacee;

import java.util.List;

import com.ttl.entity.Student;

public interface StudentService 
{
	public List<Student> getStudents();
	public Student getStudent(int id);
	public Student addStudent(Student s);
	public Student updateStudent(Student s);
	public List<Student> deleteStudent(int id);
	
	

}
