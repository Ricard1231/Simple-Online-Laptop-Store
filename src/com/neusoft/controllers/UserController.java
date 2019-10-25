package com.neusoft.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.beans.Cart;
import com.neusoft.beans.Laptop;
import com.neusoft.beans.User;
import com.neusoft.services.UserService;

@Controller
public class UserController {
	@Resource
	private UserService service;

	@RequestMapping(value = "register.html", method = RequestMethod.GET)
	public String init() {
		return "register";
	}

	@RequestMapping(value = "register.html", method = RequestMethod.POST)
	public ModelAndView register(Model model, @ModelAttribute(value = "bean") User bean) {
		return service.register(bean);
	}

	@RequestMapping(value = "login.html", method = RequestMethod.GET)
	public String init1() {
		return "login";
	}

	@RequestMapping(value = "login.html", method = RequestMethod.POST)
	public ModelAndView login(Model model, @ModelAttribute(value = "bean") User bean) {
		return service.login(bean);
	}

	@RequestMapping(value = "mainpage.html", method = RequestMethod.GET)
	public ModelAndView init2() {
		return service.showAllLaptops();
	}

	@RequestMapping(value = "laptopinfo.html", method = RequestMethod.GET)
	public ModelAndView init3(@ModelAttribute(value = "bean") Laptop bean) {
		return service.showLaptopInfo(bean.getId());
	}

	@RequestMapping(value = "addtocart.html", method = RequestMethod.POST)
	public ModelAndView addcart(@ModelAttribute(value = "bean") Cart bean) {
		return service.addtocart(bean);
	}

	@RequestMapping(value = "cart.html", method = RequestMethod.GET)
	public ModelAndView showcart(@ModelAttribute(value = "bean") User bean) {
		return service.showCart(bean.getUsername());
	}

	@RequestMapping(value = "deletecart.html", method = RequestMethod.POST)
	public ModelAndView deletecart(@ModelAttribute(value = "bean") Cart bean) {
		return service.deleteCart(bean);
	}

	@RequestMapping(value = "checkout.html", method = RequestMethod.GET)
	public String checkoutPage() {
		return "checkout";
	}

	@RequestMapping(value = "checkout.html", method = RequestMethod.POST)
	public ModelAndView checkout(@ModelAttribute(value = "bean") User bean) {
		return service.checkout(bean);
	}
}
