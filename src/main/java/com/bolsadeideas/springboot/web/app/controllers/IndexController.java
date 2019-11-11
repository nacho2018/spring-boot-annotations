package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bolsadeideas.springboot.web.app.models.Employee;
import com.bolsadeideas.springboot.web.app.models.Project;
import com.bolsadeideas.springboot.web.app.services.IService;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	@Qualifier("sales")
	public Employee employee;
	
	@Autowired
	private Project project;

	@Autowired
	private IService service2;
	
//	@Autowired
//	public void setService(IService service) {
//		this.service = service;
//	}
	
	

	@GetMapping("/start")
	public ModelAndView showEmployee() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("titulo","Showing employee");
		model.addObject("employee", employee);
		model.addObject("project",project);
		model.setViewName("showData");
		
		return model;
		
	}


	@GetMapping("/service")
	public ModelAndView showService() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("serviceObject",service2.operacion());
		mav.setViewName("showService");
		
		return mav;
		
	}
}
