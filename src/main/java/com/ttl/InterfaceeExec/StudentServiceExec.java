package com.ttl.InterfaceeExec;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttl.Interfacee.StudentService;
import com.ttl.StudentRepo.StudentRepository;
import com.ttl.entity.Student;

@Service
public class StudentServiceExec implements StudentService 
{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		studentRepository.save(s);
		return s;
	}

	@Override
	public Student updateStudent(Student s)
	{
		Integer id=s.getId();
		
		Student student = studentRepository.findById(id).get();
		student.setFirstName(s.getFirstName());
		student.setLastName(s.getLastName());
		student.setBranch(s.getBranch());
		return studentRepository.save(student);
	}

	@Override
	public List<Student>deleteStudent(int id) 
	{
		// TODO Auto-generated method stub
	
		studentRepository.deleteById(id);
		return studentRepository.findAll();
		
	}

}
