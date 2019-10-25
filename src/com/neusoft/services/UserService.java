package com.neusoft.services;

import org.springframework.web.servlet.ModelAndView;

import com.neusoft.beans.Cart;
import com.neusoft.beans.User;

public interface UserService {
	ModelAndView login(User user);
	ModelAndView register(User user);
	ModelAndView showAllLaptops();
	ModelAndView showLaptopInfo(int id);
	ModelAndView addtocart(Cart bean);
	ModelAndView showCart(String username);
	ModelAndView deleteCart(Cart cart);
	ModelAndView checkout(User user);
}
