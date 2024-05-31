package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjdbc.Course;

/*When you have some logic to run at the start of the application
	Commandlinerunner is used
*/

@Component
public class CourseSpringDataJPACommandLineRunner implements CommandLineRunner{

	@Autowired
	private SpringDataJPACourseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//Single insert
		//repository.insert();
		
		//Multiple inserts with parametets
		  repository.save(new SpringDataJPACourse(1, "AWS Spring data JPA", "Self"));
		  repository.save(new SpringDataJPACourse(2, "Java8 Spring Data JPA", "Self"));
		  repository.save(new SpringDataJPACourse(3, "Angular/Full Stack Spring data JPA",
		  "Self"));
		 
		
		//Delete with Parameters
		repository.deleteById(1L);
		 
		  
		  //Select query 
		 System.out.println("Select Query Spring JPA Output");
		  System.out.println(repository.findAll());
		  System.out.println(repository.count());
		  
		 //Custom method calling
		 System.out.println(repository.findbyAuthor("Jaa"));
		  
		 
	}
	
	

}
