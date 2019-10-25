package com.neusoft.beans;

import java.sql.Timestamp;

public class Order {
private int orderid;
private String username;
private double total;
private Timestamp time;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Timestamp getTime() {
	return time;
}
public void setTime(Timestamp time) {
	this.time = time;
}

}
