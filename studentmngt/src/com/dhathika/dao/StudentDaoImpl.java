package com.dhathika.dao;

import java.util.ArrayList;
import java.util.List;

import com.dhathika.dto.Student;

public class StudentDaoImpl implements StudentDao{

	List<Student> studentTable = new ArrayList<Student>();
	
	@Override
	public void registerStudentDao(Student student) {
	    studentTable.add(student);
		
	}

	@Override
	public Student selectStudentByIdDao(int stdId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudentDao() {
		
		return studentTable;
	}

	@Override
	public void deleteAstudentByIdDao(int stdId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateStudentDao(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
