package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // this annotation is used to talk to the database
public class CourseRepository {

	//Spring Jdbctemplate enables to fire a query against a db
	@Autowired
	private JdbcTemplate template; 

	//""" """ --> this is called text block.
	//Text block is the primary control for displaying read-only text in app.
	// to use single quotes inside text block
	//in sql it is single quote
	private String INSERT_QUERY = 
			"""
				insert into course (id,name,author)
				values
				(1, 'Java', 'Self'); 
			""";
	
	/*
	 * This insert method is to be fired while start up of the spring application
	 * for that, we need to use commandlinerunner
	 */
	public void insert() {		
		/*
		 * below update function used to do single SQL update operation (such as an
		 * insert, update or delete statement).
		 */
		template.update(INSERT_QUERY);
	}
	
	private String INSERT_QUERY_PARAMETERIZATION = 
			"""
				insert into course (id,name,author)
				values
				(?,?, ?); 
			""";
	
	
	public void parameterizedInsertwithObject(Course course) {	
		//from second arg are the parameters for ?
		template.update(INSERT_QUERY_PARAMETERIZATION, 
							course.getId(), course.getName(), course.getAuthor());
	}
	
	//Delete
	private String DELETE_QUERY = 
			"""
				delete from course where id = ?; 
			""";
	
	public void deleteCourse(Course course) {
		//second arg is the parameter for ?
		template.update(DELETE_QUERY, course.getId());
	}

	
	//Select
	private String SELECT_QUERY = 
			"""
				select * from course where id = ?; 
			""";
	
	public Course selectCourse(Course course) {
		//second arg is the parameter for ?
		//Need to map the resultset of select query to the bean
		//Resultset --> Bean --> Row mapper --> so linking the result set of select query with Course bean using BeanPropertyRowMapper
		return template.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<Course>(Course.class),course.getId());
	}

	
	
	
}

