package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.StudentTable;
import com.college.pojo.ApiResponse;
import com.college.repository.StudentTableRepo;

@RestController
public class StudentController {
	@Autowired
	public StudentTableRepo studentrepo;

	@PostMapping("student")
	ApiResponse dataSaved(@RequestParam String StudentId, @RequestParam String StudentName, @RequestParam String Email,
			@RequestParam int RollNumber) {
		StudentTable std = new StudentTable();
		std.setStudentId(StudentId);
		std.setStudentName(StudentName);
		std.setStudentEmail(Email);
		std.setStudentRollNo(RollNumber);
		studentrepo.save(std);
		ApiResponse getResponse = new ApiResponse();
		getResponse.setData(std);
		getResponse.setSuccess(true);
		return getResponse;

	}

}
