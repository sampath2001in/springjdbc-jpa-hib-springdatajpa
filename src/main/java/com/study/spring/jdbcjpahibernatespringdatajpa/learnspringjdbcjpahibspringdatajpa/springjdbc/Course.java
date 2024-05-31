package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjdbc;

public class Course {
	
	int id;
	String name;
	String author;
	
	int a = 1_000;
		
	public Course() {
		super();
	}

	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
