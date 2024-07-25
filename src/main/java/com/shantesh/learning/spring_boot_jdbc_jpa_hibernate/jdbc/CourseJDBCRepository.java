package com.shantesh.learning.spring_boot_jdbc_jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY="insert into course(id, name, author) values (222, 'shantesh', 'Daniel Steldom')";
	
	public void insert() {
		jdbcTemplate.update(INSERT_QUERY);
	}

}
