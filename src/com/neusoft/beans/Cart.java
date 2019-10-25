package com.neusoft.beans;

public class Cart {
private int id, quantity;
private double price, total, totalcost;
private String username, laptopname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public String getLaptopname() {
	return laptopname;
}
public void setLaptopname(String laptopname) {
	this.laptopname = laptopname;
}
public double getTotalcost() {
	return totalcost;
}
public void setTotalcost(double totalcost) {
	this.totalcost = totalcost;
}

}
