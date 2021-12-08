package com.sample.stud.studentservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.stud.studentpojo.Student;
import com.sample.stud.studentrepo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	public Student saveStudent(Student student) {
		return repo.save(student);
	       
}
	public List<Student>getstudentList(){
		return repo.findAll();
		
	}
public Student getStudentbyid(int id) {
	return repo.findById(id).get();
	
}
public String deleteStudentdata(int id) {
	repo.deleteById(id);
	return "Deleted Successfully";
	
}
public Student updateStudentdata(int id, Student student){
Student updatestu = repo.findById(id).get();
updatestu.setName(student.getName());
updatestu.setDepartment(student.getDepartment());
return repo.save(updatestu);
}
}