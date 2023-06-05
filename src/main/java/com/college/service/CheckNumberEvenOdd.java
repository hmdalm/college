package com.college.service;

import org.springframework.stereotype.Service;

@Service
public class CheckNumberEvenOdd {

	public String isEven(int number) {

		if (number % 2 == 0) {
			return "Even";
		} else {
			return "odd";

		}

	}

}
