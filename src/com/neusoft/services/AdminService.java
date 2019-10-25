package com.neusoft.services;

import org.springframework.web.servlet.ModelAndView;

import com.neusoft.beans.Laptop;
import com.neusoft.beans.User;

public interface AdminService {
	ModelAndView registerForm();
	ModelAndView registerLaptop(Laptop laptop);
	ModelAndView showAll();
	ModelAndView deleteUser(int id);
	ModelAndView deleteLaptop(int id);
	ModelAndView deleteOrder(int id);
	ModelAndView getUserInfo(int id);
	ModelAndView getLaptopInfo(int id);
	ModelAndView updateUser(User user);
	ModelAndView updateLaptop(Laptop laptop);
}
