package com.study.spring.jdbcjpahibernatespringdatajpa.learnspringjdbcjpahibspringdatajpa.springjpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="jpacourse") //@Entity (Jakarta one) used to map the pojo bean to the database table "JPACourse".
public class JPACourse {
	
	@Id	 //denotes primary key of the table Course
	private int id;
	
	@Column (name="name") // denote column "name" of the table Course
	String name;
	
	@Column(name="author") //denotes column "author" of the table Course
	String author;
	
		
	public JPACourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JPACourse(int id, String name, String author) {
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
