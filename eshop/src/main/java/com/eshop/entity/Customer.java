package com.eshop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	String 	custId, 
			custFname, 
			custLname, 
			custAddress, 
			custPhone;
	

	@Id
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustFname() {
		return custFname;
	}

	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}

	public String getCustLname() {
		return custLname;
	}

	public void setCustLname(String custLname) {
		this.custLname = custLname;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

}
