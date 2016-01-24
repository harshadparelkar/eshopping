package com.eshop.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eshop.entity.Customer;



public class UserController {

	
	@RequestMapping(method=RequestMethod.POST, value="/customer", 
					headers = {"Content-type=application/json"})
	@ResponseBody
	public Customer addCutomer(@RequestBody Customer customer){
		
		System.out.println( customer.getUserId());
		
		
		return null;
	}
}
