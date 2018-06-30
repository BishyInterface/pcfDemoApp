package com.spring.pcf.pcfDemoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pcf.pcfDemoApp.bean.pcfDataBean;


@RestController
public class pcfDemoController {
	
	@GetMapping("/allData/")
	public pcfDataBean getAllData(){
		return new pcfDataBean("myData1","myData2");
		

		
	}
	

}
