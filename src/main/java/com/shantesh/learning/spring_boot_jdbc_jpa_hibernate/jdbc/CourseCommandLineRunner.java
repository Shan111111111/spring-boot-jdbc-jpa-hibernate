package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.pojo.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJDBCRepository courseJDBCRepository;

	@Override
	public void run(String... args) throws Exception {

		courseJDBCRepository.insert(new Course(234, "Samuel", "Some Author"));
		courseJDBCRepository.insert(new Course(235, "somevalue", "Some Autdsdsdsdhor"));
		courseJDBCRepository.insert(new Course(24, "asf", "Some dfdfAuthor"));
		
		courseJDBCRepository.delete(235);

		System.out.println(courseJDBCRepository.findById(24));
		System.out.println(courseJDBCRepository.findById(234));
	}

}
