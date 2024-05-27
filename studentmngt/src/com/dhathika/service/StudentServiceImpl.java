package com.dhathika.service;

import java.util.List;

import com.dhathika.dao.StudentDao;
import com.dhathika.dao.StudentDaoImpl;
import com.dhathika.dto.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao = new StudentDaoImpl();
	@Override
	public void registerStudentService(Student student) {
		studentDao.registerStudentDao(student);
		
	}

	@Override
	public Student selectStudentByIdService(int stdId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudentService() {
		List<Student> studentList = studentDao.selectAllStudentDao();
		return studentList;
	}

	@Override
	public void deleteAstudentByIdService(int stdId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateStudentService(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
