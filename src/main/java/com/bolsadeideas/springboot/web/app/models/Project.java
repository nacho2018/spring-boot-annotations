package com.bolsadeideas.springboot.web.app.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Project {
	
	@Autowired
	private Integer id;
	@Autowired
	@Qualifier("projectName")
	private String name;
	@Autowired
	private Employee employee;
	
	@PostConstruct
	public void executePostConstructAction() {
		
		System.out.println("The project has been created");
	}
	
	@PreDestroy
	public void executeDestroyAction() {
		System.out.println("The project has been deleted");
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
