package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjdbc.Course;

/*When you have some logic to run at the start of the application
	Commandlinerunner is used
*/

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//Single insert
		//repository.insert();
		
		//Multiple inserts with parametets
		  repository.insertJpaCourse(new JPACourse(1, "AWS JPA", "Self"));
		  repository.insertJpaCourse(new JPACourse(2, "Java8 JPA", "Self"));
		  repository.insertJpaCourse(new JPACourse(3, "Angular/Full Stack JPA",
		  "Self"));
		 
		
		//Delete with Parameters
		
		 repository.deleteJpaCourse(1);
		 
		  
		  //Select query 
		 System.out.println("Select Query JPA Output");
		  System.out.println(repository.selectJpaCourse(new JPACourse(2, "Java8",
		 "Self")));
		 
	}
	
	

}
