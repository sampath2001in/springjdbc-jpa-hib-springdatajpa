package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJPACourseRepository extends JpaRepository<SpringDataJPACourse, Long> {
	
	/*
	 * JpaRepository is an inbuilt repository used to contact db, which is maintained or present 
	 * in org.springframework.data.jpa.repository
	 * For others in SPring jdbc, Spring JPA we have to construct our own JpaRepository.
	 * 
	 * // Parameters: SpringDataJPACourse is the Pojo 
	 * 				  Long is the id type of primary key of the pojo
	 */
	/* Nothing needed here, everything taken care by spring data jpa, 
	 * 
	 * //Dont need any entity manager //private EntityManager entityManager;
	 * //EntityManager (Jakarta one) class to manage the entity for database
	 * commnunication.
	 * 
	 * //There are no methods to define here unlike Spring jdbc (jdbctemplate), jpa
	 * (entitymanager)
	 * 
	 * Nothing needed here, everything taken care by spring data jpa, but we can write custom methods
	 * Beauty of Spring data jpa
	 */
	 // Can write a method to find by any of the Pojo bean SpringDataJPACourse members: eg author. 
	//the method name should be "findby<<ColumnName>>"
	
	 List<SpringDataJPACourse> findbyAuthor (String name);	
	 
	
}

