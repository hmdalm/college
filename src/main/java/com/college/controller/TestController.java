package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.DummyTable;
import com.college.pojo.ApiResponse;
import com.college.repository.DummyTableRepo;
import com.college.service.CalculatorService;
import com.college.service.CheckNumberEvenOdd;

@RestController
public class TestController {

	@Autowired
	private CalculatorService calcService;

	@GetMapping("/test")
	public String test() {

		return "Ok";
	}

	@GetMapping("/add")
	public ApiResponse addValue(@RequestParam Integer numOne, @RequestParam Integer numTwo) {
		int result = calcService.add(numOne, numTwo);
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setSuccess(true);
		apiResponse.setData(result);
		return apiResponse;
	}

	@Autowired
	private CheckNumberEvenOdd checkNumber;

	@GetMapping("/even")
	public ApiResponse apiResponse(@RequestParam Integer num) {
		ApiResponse apiResponse = new ApiResponse();
		String answer = checkNumber.isEven(num);

		apiResponse.setSuccess(true);
		apiResponse.setData(answer);
		return apiResponse;

	}

}
