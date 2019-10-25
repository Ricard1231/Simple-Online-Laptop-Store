package com.neusoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.beans.Cart;
import com.neusoft.beans.Laptop;
import com.neusoft.beans.User;

public interface UserDao {
	public int register(User user);
	public String getPassword(String username);
	public List<Laptop> showAllLaptops();
	public Laptop showLaptopInfo(int id);
	public int addtocart(Cart cart);
	public List<Cart> showCart(String username);
	public int deleteCart(int id);
	public String getCardpw(String cardnum);
	public int deleteCartAll(String username);
	public int addOrder(@Param("username")String username, @Param("totalcost")double totalcost, @Param("timestamp")java.sql.Timestamp timestamp);
	public User getUserInfo(@Param("cardnum")String cardnum, @Param("cardpw")String cardpw);
}
