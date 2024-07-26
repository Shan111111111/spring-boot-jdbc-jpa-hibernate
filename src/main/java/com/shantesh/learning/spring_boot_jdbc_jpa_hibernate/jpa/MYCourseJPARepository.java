package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.pojo.Course;

public interface MYCourseJPARepository extends JpaRepository<Course, Integer>{}
