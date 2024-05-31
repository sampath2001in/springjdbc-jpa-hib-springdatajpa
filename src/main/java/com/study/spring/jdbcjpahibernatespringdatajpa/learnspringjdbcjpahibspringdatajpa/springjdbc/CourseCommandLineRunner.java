package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*When you have some logic to run at the start of the application
	Commandlinerunner is used
*/

//@Component
/*public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//Single insert
		//repository.insert();
		
		//Multiple inserts with parametets
		  repository.parameterizedInsertwithObject(new Course(4, "AWS", "Self"));
		  repository.parameterizedInsertwithObject(new Course(5, "Java8", "Self"));
		  repository.parameterizedInsertwithObject(new Course(6, "Angular/Full Stack",
		  "Self"));
		 
		
		//Delete with Parameters
		repository.deleteCourse(new Course(1, "AWS", "Self"));
		
		//Select query
		System.out.println("Select Query Output");
		System.out.println(repository.selectCourse(new Course(2, "Java8", "Self")));
	}
	
	

}*/
