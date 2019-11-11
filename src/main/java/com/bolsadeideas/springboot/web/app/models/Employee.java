package com.bolsadeideas.springboot.web.app.models;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String id;
	private String name;
	private Integer age;
	public String getId() {
		return id;
	}
	@Required
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
