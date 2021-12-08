package com.sample.stud.studentrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.stud.studentpojo.Student;
@Repository
	public interface StudentRepo extends JpaRepository <Student, Integer> {
		 
	}

