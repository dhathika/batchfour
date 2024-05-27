package com.dhathika.dao;

import java.util.List;

import com.dhathika.dto.Student;

public interface StudentDao {

	public void registerStudentDao(Student student);
	public Student selectStudentByIdDao(int stdId);
	public List<Student> selectAllStudentDao();
	public void deleteAstudentByIdDao(int stdId);
	public Student updateStudentDao(Student student);
}
