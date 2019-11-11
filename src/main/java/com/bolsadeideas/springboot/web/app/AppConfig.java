package com.bolsadeideas.springboot.web.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.web.app.models.Employee;
import com.bolsadeideas.springboot.web.app.services.IService;
import com.bolsadeideas.springboot.web.app.services.Service2Impl;
import com.bolsadeideas.springboot.web.app.services.ServiceImpl;

@Configuration
public class AppConfig {

	@Qualifier("sales")
	@Bean
	public Employee employeeSales() {
		Employee emp = new Employee();
		emp.setId("325235D423AZ");
		emp.setName("Sales employee");
		
		return emp;
	}
	
	@Primary
	@Bean
	public Employee employeeMarketing() {
		Employee emp = new Employee();
		emp.setId("XXX45D5345");
		emp.setName("Marketing employee");
		
		return emp;
	}
	
	@Bean
	@Qualifier("projectName")
	public String getName() {
		return "Sales Project for Houston";
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public Integer getID() {
		return new Integer(45256);
	}
	
	@SuppressWarnings("deprecation")
	@Primary
	@Bean
	public Integer getIDPrincipal() {
		return new Integer(11111);
	}
	
	@Bean
	public IService service1() {
		return new ServiceImpl();
	}
	
	@Bean
	public IService service2() {
		return new Service2Impl();
	}
	
}
