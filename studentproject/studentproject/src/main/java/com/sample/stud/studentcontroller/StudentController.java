package com.sample.stud.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.stud.studentpojo.Student;
import com.sample.stud.studentservice.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
@PostMapping("/savedata")
public Student saveinfo(@RequestBody Student info ) {
	return studentservice.saveStudent(info);
}
@GetMapping("/findstudent")
public List<Student> findStudents(){
	return studentservice.getstudentList();
	}
@GetMapping("/getid/{id}")
public Student getByid(@PathVariable int id) {
	return studentservice.getStudentbyid(id);
	
}
@DeleteMapping("/removeid/{id}")
public String deleteid(@PathVariable int id) {
	studentservice.deleteStudentdata(id);
	return "Deleted Successfully";
	
}
@PutMapping("/updateid/{id}")
public Student updateid(@PathVariable int id,@RequestBody Student student) {
	return studentservice.updateStudentdata(id, student);
	
}

}
