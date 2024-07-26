package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jpa;

import org.springframework.stereotype.Repository;

import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.pojo.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MYCourseJPARepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public void delete(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

	public void insert(Course course) {
		entityManager.merge(course);
	}

}
