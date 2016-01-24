package com.eshop.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

	String 	orderId,
			custId,
			productId,
			supplierId;
	Calendar 	orderCreatedDate,
				orderModifiedDate;
	
	@Id
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Calendar getOrderCreatedDate() {
		return orderCreatedDate;
	}
	public void setOrderCreatedDate(Calendar orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}
	public Calendar getOrderModifiedDate() {
		return orderModifiedDate;
	}
	public void setOrderModifiedDate(Calendar orderModifiedDate) {
		this.orderModifiedDate = orderModifiedDate;
	}
	
	
}
