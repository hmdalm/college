package com.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.DummyTable;

@Repository
public interface DummyTableRepo extends JpaRepository<DummyTable, String>{
	
	List<DummyTable> findByFirstName(String firstName);
//	List<DummyTable> findByEmailId(String emailId);
	String findByEmailId(String emailId);

}
