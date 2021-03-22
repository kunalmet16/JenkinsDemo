package com.example.JenkinsDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Testing");
		assertEquals(true, true);
	}

}
