package com.example.JenkinsDemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class JenkinsDemoApplication {

	
	public static void main(String[] args) {
		System.out.println("Initiated");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
