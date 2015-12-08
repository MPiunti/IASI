package com.concretepage;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.concretepage.soap.Student;

@Component
public class StudentUtility {
	private Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
	public StudentUtility(){
		
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setName("Michael Jordan");
		s1.setAge(20);
		s1.setClazz("2-F");
		studentMap.put(1, s1);
		
		
		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setName("Shyam Gestalt");
		s2.setAge(22);
		s2.setClazz("4-G");
		studentMap.put(2, s2);
	}
	
	
	public Student getStudent(int studentId){
		return studentMap.get(studentId);
	}
}
