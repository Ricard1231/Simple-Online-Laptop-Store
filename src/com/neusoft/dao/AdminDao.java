package com.neusoft.dao;

import java.util.List;

import com.neusoft.beans.Images;
import com.neusoft.beans.Laptop;
import com.neusoft.beans.Order;
import com.neusoft.beans.User;

public interface AdminDao {
	public int registerLaptop(Laptop laptop);
	public List<Images> getImages();
	public List<User> getUsers();
	public List<Laptop> getLaptops();
	public List<Order> getOrders();
	public int deleteUser(int id);
	public int deleteLaptop(int id);
	public int deleteOrder(int id);
	public User getUserInfo(int id);
	public Laptop getLaptopInfo(int id);
	public int updateUser(User user);
	public int updateLaptop(Laptop laptop);
}
