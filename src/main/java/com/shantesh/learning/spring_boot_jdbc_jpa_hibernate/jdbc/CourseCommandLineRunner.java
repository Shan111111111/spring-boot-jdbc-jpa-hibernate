package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jpa.MYCourseJPARepository;
import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.pojo.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private MYCourseJPARepository myCourseJPARepository; 

	@Override
	public void run(String... args) throws Exception {

		myCourseJPARepository.save(new Course(234, "spring Jpa samuel value", "spring jpa Some Author vlaue"));
		myCourseJPARepository.save(new Course(235, "spring Jpa somevalue value", "spring jpa Some Autdsdsdsdhor"));
		myCourseJPARepository.save(new Course(24, "spring Jpa asf value", "spring jpa Some dfdfAuthor"));
		
		myCourseJPARepository.deleteById(235);

		System.out.println(myCourseJPARepository.findById(24));
		System.out.println(myCourseJPARepository.findById(234));
	}

}
