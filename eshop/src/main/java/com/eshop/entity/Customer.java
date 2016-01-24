package com.eshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer extends User {

	String 	custType;
	List<Order> orders;
			
	


}
