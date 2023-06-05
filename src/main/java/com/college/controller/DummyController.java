package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.DummyTable;
import com.college.pojo.ApiResponse;
import com.college.repository.DummyTableRepo;

@RestController
public class DummyController {
	@Autowired
	DummyTableRepo dummyRepo;

	@PostMapping("saveTable")
	public ApiResponse dataSave(@RequestParam String firstName, @RequestParam String emailid) {
		DummyTable dumty = new DummyTable();
		dumty.setEmailId(emailid);
		dumty.setFirstName(firstName);
		dummyRepo.save(dumty);
		ApiResponse api = new ApiResponse();
		api.setSuccess(true);
		api.setData(dumty);
	//dummyRepo.findByEmailId("abc_@gmail.com");
		return api;

	}

}
