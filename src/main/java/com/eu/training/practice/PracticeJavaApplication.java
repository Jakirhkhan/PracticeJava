package com.eu.training.practice;

import com.eu.training.practice.constructor.UserService;
import com.eu.training.practice.loop.LoopTesting;
import com.eu.training.practice.operator.OperatorTesting;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
@SpringBootApplication
public class PracticeJavaApplication {

	UserService userService = new UserService();
	public static void main(String[] args) {
		SpringApplication.run(PracticeJavaApplication.class, args);

		System.out.println("\nTesting Switch statement:");
		OperatorTesting operatorTesting = new OperatorTesting();
		operatorTesting.switchTesting(5);
		System.out.println("\n\nTesting For Loop:");
		LoopTesting loopTesting = new LoopTesting();
		loopTesting.forTesting();

	}

	@GetMapping("/name")
	public String showName(){
		return userService.getName();
	}

	@GetMapping("/all-names")
	public String []showAllNames(){
		return userService.getAllNames();
	}
	public static void sayHello(){

		System.out.println("Thank You!!");
	}


}
