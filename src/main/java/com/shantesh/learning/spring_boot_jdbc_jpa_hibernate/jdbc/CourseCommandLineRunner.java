package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJDBCRepository courseJDBCRepository;

	@Override
	public void run(String... args) throws Exception {

		courseJDBCRepository.insert();

	}

}
