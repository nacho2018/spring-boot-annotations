package com.bolsadeideas.springboot.web.app.services;


import org.springframework.stereotype.Service;


public class ServiceImpl  implements IService{

	@Override
	public String operacion() {
	
		return "Esto es una operación.";
	}

}
