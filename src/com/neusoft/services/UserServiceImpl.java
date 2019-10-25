package com.neusoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.beans.Cart;
import com.neusoft.beans.Laptop;
import com.neusoft.beans.User;
import com.neusoft.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	public ModelAndView register(User user) {
		ModelAndView mav;
		String url, message;
		if (user.getUsername().isEmpty() || user.getPassword().isEmpty() || user.getConfirmcardpw().isEmpty()
				|| user.getCpw().isEmpty() || user.getCardnum().isEmpty()) {
			url = "register";
			message = "*Please fill in all fields properly";
		} else if (!user.getPassword().equals(user.getCpw())) {
			url = "register";
			message = "*Please confirm password";
		} else if (!user.getCardpw().equals(user.getConfirmcardpw())) {
			url = "register";
			message = "*Please confirm card password";
		} else if (dao.register(user) != 0) {
			url = "redirect:login.html";
			message = "";
		} else {
			url = "register";
			message = "*Please try again!";
		}
		mav = new ModelAndView(url);
		mav.addObject("message", message);
		return mav;
	}

	public ModelAndView login(User user) {
		ModelAndView mav;
		String url, message;
		if (user.getUsername().equals("") || user.getPassword().equals("")) {
			url = "login";
			message = "*Please fill in all fields";
		} else if (user.getUsername().equals("admin") && user.getPassword().equals("admin123")) {
			url = "redirect:admin.html";
			message = "";
		} else if (user.getPassword().equals(dao.getPassword(user.getUsername()))) {
			url = "redirect:mainpage.html";
			message = user.getUsername();
		} else {
			url = "login";
			message = "*Please try again";
		}
		mav = new ModelAndView(url);
		mav.addObject("message", message);
		return mav;
	}

	public ModelAndView showAllLaptops() {
		ModelAndView mav = new ModelAndView("mainpage");
		List<Laptop> laptops = dao.showAllLaptops();
		mav.addObject("laptops", laptops);
		return mav;
	}

	public ModelAndView showLaptopInfo(int id) {
		ModelAndView mav = new ModelAndView("laptopinfo");
		Laptop laptop = dao.showLaptopInfo(id);
		mav.addObject("laptop", laptop);
		return mav;
	}

	public ModelAndView addtocart(Cart cart) {
		ModelAndView mav;
		String url, username;
		cart.setTotal(cart.getPrice() * cart.getQuantity());
		dao.addtocart(cart);
		url = "redirect:cart.html";
		username = cart.getUsername();
		mav = new ModelAndView(url);
		mav.addObject("username", username);
		return mav;
	}

	public ModelAndView showCart(String username) {
		ModelAndView mav = new ModelAndView("cart");
		List<Cart> list = dao.showCart(username);
		mav.addObject("list", list);
		return mav;
	}
	
	public ModelAndView deleteCart(Cart cart) {
		ModelAndView mav = new ModelAndView("redirect:cart.html");
		dao.deleteCart(cart.getId());
		String username = cart.getUsername();
		mav.addObject("username", username);
		return mav;
	}
	
	public ModelAndView checkout(User user) {
		ModelAndView mav;
		String url, message;
		if(user.getCardpw().isEmpty() || user.getCardnum().isEmpty() ) {
			url = "checkout";
			message = "*Please fill in all fields properly";
		} else if(user.getCardpw().equals(dao.getCardpw(user.getCardnum()))) {
			User userObj = dao.getUserInfo(user.getCardnum(), user.getCardpw());
			dao.deleteCartAll(userObj.getUsername());
			long time = System.currentTimeMillis();
			java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
			dao.addOrder(userObj.getUsername(), user.getTotalcost(), timestamp);
			url = "redirect:mainpage.html";
			message = userObj.getUsername();
		} else {
			url = "checkout";
			message = "*Please try again";
		}
		mav = new ModelAndView(url);
		mav.addObject("message", message);
		return mav;
	}
}
