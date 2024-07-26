package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jpa.MYCourseJPARepository;
import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.pojo.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private MYCourseJPARepository myCourseJPARepository; //changed to coursejparepository and deleted the jdbcjparepository, 

	@Override
	public void run(String... args) throws Exception {

		myCourseJPARepository.insert(new Course(234, "Jpa samuel value", "jpa Some Author vlaue"));
		myCourseJPARepository.insert(new Course(235, "Jpa somevalue value", "jpa Some Autdsdsdsdhor"));
		myCourseJPARepository.insert(new Course(24, "Jpa asf value", "Some dfdfAuthor"));
		
		myCourseJPARepository.delete(235);

		System.out.println(myCourseJPARepository.findById(24));
		System.out.println(myCourseJPARepository.findById(234));
	}

}
