package com.neusoft.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.beans.Laptop;
import com.neusoft.beans.Order;
import com.neusoft.beans.User;
import com.neusoft.services.AdminService;

@Controller
public class AdminController {
@Resource
private AdminService service;

@RequestMapping(value="admin.html", method=RequestMethod.GET)
public ModelAndView init() {
	return service.showAll();
}

@RequestMapping(value="registerlaptop.html", method=RequestMethod.GET)
public ModelAndView init1() {
	return service.registerForm();
}

@RequestMapping(value="registerlaptop.html", method=RequestMethod.POST)
public ModelAndView registerlaptop(@ModelAttribute(value="bean") Laptop bean) {
	return service.registerLaptop(bean);
}

@RequestMapping(value="deleteuser.html", method=RequestMethod.GET)
public ModelAndView deleteuser(@ModelAttribute(value="bean") User bean) {
	return service.deleteUser(bean.getId());
}

@RequestMapping(value="updateuser.html", method=RequestMethod.GET)
public ModelAndView updateuser1(@ModelAttribute(value="bean") User bean) {
	return service.getUserInfo(bean.getId());
}

@RequestMapping(value="updateuser.html", method=RequestMethod.POST)
public ModelAndView updateuser2(@ModelAttribute(value="bean") User bean) {
	return service.updateUser(bean);
}

@RequestMapping(value="deletelaptop.html", method=RequestMethod.GET)
public ModelAndView deletelaptop(@ModelAttribute(value="bean") Laptop bean) {
	return service.deleteLaptop(bean.getId());
}

@RequestMapping(value="updatelaptop.html", method=RequestMethod.GET)
public ModelAndView updatelaptop1(@ModelAttribute(value="bean") Laptop bean) {
	return service.getLaptopInfo(bean.getId());
}

@RequestMapping(value="updatelaptop.html", method=RequestMethod.POST)
public ModelAndView updatelaptop2(@ModelAttribute(value="bean") Laptop bean) {
	return service.updateLaptop(bean);
}

@RequestMapping(value="deleteorder.html", method=RequestMethod.GET)
public ModelAndView deleteorder(@ModelAttribute(value="bean") Order bean) {
	return service.deleteOrder(bean.getOrderid());
}
}
