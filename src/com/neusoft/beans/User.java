package com.neusoft.beans;

public class User {
private int id;
private String username, password, cpw, cardnum, cardpw, confirmcardpw;
private double totalcost;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCpw() {
	return cpw;
}

public void setCpw(String cpw) {
	this.cpw = cpw;
}

public String getCardnum() {
	return cardnum;
}

public void setCardnum(String cardnum) {
	this.cardnum = cardnum;
}

public String getCardpw() {
	return cardpw;
}

public void setCardpw(String cardpw) {
	this.cardpw = cardpw;
}

public String getConfirmcardpw() {
	return confirmcardpw;
}

public void setConfirmcardpw(String confirmcardpw) {
	this.confirmcardpw = confirmcardpw;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getTotalcost() {
	return totalcost;
}

public void setTotalcost(double totalcost) {
	this.totalcost = totalcost;
}

}
