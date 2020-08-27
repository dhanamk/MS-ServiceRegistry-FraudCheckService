package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.fiegn.DupcheckFeign;

@RestController
public class FraudcheckController {

	@Autowired
	private DupcheckFeign fraudcheckFeign;
	
	@GetMapping("/fraudcheck/{name}")
	public String getFraudcheckService(@PathVariable("name")String name)
	{
		String dupresponse=fraudcheckFeign.communicateAbstractMethodDupcheck();
		String dupresponseTwo=fraudcheckFeign.communicateAbstractMethodDupcheckTwo();
		String fraudresponse="Hi "+name;
		
		String finalresponse=fraudresponse+" , "+dupresponse+" , "+dupresponseTwo;
		return finalresponse;
	}
}
