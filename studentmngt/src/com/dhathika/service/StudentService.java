package com.dhathika.service;

import java.util.List;

import com.dhathika.dto.Student;

public interface StudentService {
	
	public void registerStudentService(Student student);
	public Student selectStudentByIdService(int stdId);
	public List<Student> selectAllStudentService();
	public void deleteAstudentByIdService(int stdId);
	public Student updateStudentService(Student student);

}
