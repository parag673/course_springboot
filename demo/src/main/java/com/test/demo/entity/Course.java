package com.test.demo.entity;

public class Course {

	private long id;
	private String name;
	private String description;
	
	
	public Course(long id, String name,String description) {
		super();
		this.id=id;
	    this.description=description;
		this.name=name;
	}
	public Course() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
