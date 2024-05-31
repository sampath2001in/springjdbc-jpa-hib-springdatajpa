package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjdbc.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository // this annotation is used to talk to the database
@Transactional //need to enable this to do transaction with db for spring jpa
public class CourseJPARepository {

	@PersistenceContext //takes care to create a unique EntityManager for every transaction (communication with the database)
	private EntityManager entityManager; //EntityManager (Jakarta one) class to manage the entity for database commnunication.
	
	
	//Insert
	
	/* No need of insert query
	 * private String INSERT_QUERY = """ insert into course (id,name,author) values
	 * (1, 'Java', 'Self'); """;
	 */
	
	/*
	 * This insert method is to be fired while start up of the spring application
	 * for that, we need to use commandlinerunner
	 */
	@Transactional
	public void insertJpaCourse(JPACourse jpaCourse) {		
		//entitymanager merge method used to insert, no specific query unlike Spring jdbc, this will do the trick.
		entityManager.merge(jpaCourse);
	}
	

	//Select
	
	/* No need of select query
	 * //Select private String SELECT_QUERY = """ select * from course where id = ?;
	 * """;
	 */
	
	public JPACourse selectJpaCourse(JPACourse jpacourse) {
		return entityManager.find(jpacourse.getClass(), jpacourse.getId());
	}

	
	//Delete 
	/* No need to have delete query
	 * private String DELETE_QUERY = """ delete from course where id = ?; """;
	 */
	
	
	public void deleteJpaCourse(JPACourse jpacourse) {
		entityManager.remove(jpacourse);
	}
	
	public void deleteJpaCourse(long id) {
		JPACourse jpacourse = entityManager.find(JPACourse.class, id);
		entityManager.remove(jpacourse);
	}

	

	
	
	
}

