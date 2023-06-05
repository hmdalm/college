package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.StudentTable;

@Repository
public interface StudentTableRepo extends JpaRepository<StudentTable, String> {
	StudentTable findByStudentRollNo(int studentRollNo);

}
