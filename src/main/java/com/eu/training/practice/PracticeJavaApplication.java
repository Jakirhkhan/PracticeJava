package com.eu.training.practice;

import com.eu.training.practice.loop.LoopTesting;
import com.eu.training.practice.operator.OperatorTesting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeJavaApplication.class, args);

		System.out.println("Testing Switch statement:");
		OperatorTesting operatorTesting = new OperatorTesting();
		operatorTesting.switchTesting(5);
		System.out.println("\n\nTesting For Loop:");
		LoopTesting loopTesting = new LoopTesting();
		loopTesting.forTesting();

	}


}
