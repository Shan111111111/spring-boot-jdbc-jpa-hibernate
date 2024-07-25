package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.pojo.Course;

@Repository
public class CourseJDBCRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY="insert into course(id, name, author) values (?, ?, ?)";
	private String DELETE_QUERY="DELETE FROM course WHERE id = ?";
	private String SELECT_QUERY="select * FROM course WHERE id = ?";
	

	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}



	public void delete(long id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}

}
