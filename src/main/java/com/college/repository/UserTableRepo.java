package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entity.UserTable;

@Repository
public interface UserTableRepo extends JpaRepository<UserTable, String> {
	UserTable findByMobileNumber(long mobileNumber);


}
