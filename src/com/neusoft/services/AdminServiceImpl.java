package com.neusoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.util.StringUtils;
import com.neusoft.beans.Laptop;
import com.neusoft.beans.Order;
import com.neusoft.beans.User;
import com.neusoft.dao.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao dao;

	public ModelAndView registerForm() {
		ModelAndView mav = new ModelAndView("registerlaptop");
		mav.addObject("imagelist", dao.getImages());
		return mav;
	}

	public ModelAndView registerLaptop(Laptop laptop) {
		ModelAndView mav;
		String url, message;
		if (laptop.getName().isEmpty() || laptop.getBrand().isEmpty() || laptop.getOs().isEmpty()
				|| laptop.getGraphics().isEmpty() || laptop.getImage().isEmpty() || laptop.getPrice().isEmpty()
				|| laptop.getProcessor().isEmpty() || laptop.getRam().isEmpty() || laptop.getResolution().isEmpty()
				|| laptop.getScreen().isEmpty() || laptop.getStorage().isEmpty()
				|| Double.isNaN(Double.parseDouble(laptop.getPrice()))) {
			url = "registerlaptop";
			message = "*Please fill in all fields properly";
		} else if (dao.registerLaptop(laptop) != 0) {
			url = "redirect:admin.html";
			message = "Register Success";
		} else {
			url = "registerlaptop";
			message = "*Please try again";
		}
		mav = new ModelAndView(url);
		mav.addObject("registermessage", message);
		return mav;
	}

	public ModelAndView showAll() {
		ModelAndView mav = new ModelAndView("adminpage");
		List<User> listuser = dao.getUsers();
		List<Laptop> listlaptop = dao.getLaptops();
		List<Order> listorder = dao.getOrders();
		mav.addObject("listuser", listuser);
		mav.addObject("listlaptop", listlaptop);
		mav.addObject("listorder", listorder);
		return mav;
	}

	public ModelAndView deleteUser(int id) {
		ModelAndView mav = new ModelAndView("redirect:admin.html");
		dao.deleteUser(id);
		return mav;
	}

	public ModelAndView deleteLaptop(int id) {
		ModelAndView mav = new ModelAndView("redirect:admin.html");
		dao.deleteLaptop(id);
		return mav;
	}

	public ModelAndView deleteOrder(int id) {
		ModelAndView mav = new ModelAndView("redirect:admin.html");
		dao.deleteOrder(id);
		return mav;
	}

	public ModelAndView getUserInfo(int id) {
		ModelAndView mav = new ModelAndView("userupdate");
		User user = dao.getUserInfo(id);
		mav.addObject("user", user);
		return mav;
	}

	public ModelAndView getLaptopInfo(int id) {
		ModelAndView mav = new ModelAndView("laptopupdate");
		Laptop laptop = dao.getLaptopInfo(id);
		mav.addObject("imagelist", dao.getImages());
		mav.addObject("laptop", laptop);
		return mav;
	}

	public ModelAndView updateUser(User user) {
		ModelAndView mav;
		String message;
		if (user.getUsername().isEmpty() || user.getPassword().isEmpty() || user.getCardpw().isEmpty()
				|| user.getCardnum().isEmpty() || StringUtils.isStrictlyNumeric(user.getCardnum())) {
			message = "*Please fill in all fields properly";
		}
		if (dao.updateUser(user) != 0) {
			message = "";
		} else {
			message = "*Update Failed";
		}
		mav = new ModelAndView("redirect:admin.html");
		mav.addObject("message", message);
		return mav;
	}

	public ModelAndView updateLaptop(Laptop laptop) {
		ModelAndView mav;
		String message;
		if (laptop.getName().isEmpty() || laptop.getBrand().isEmpty() || laptop.getOs().isEmpty()
				|| laptop.getGraphics().isEmpty() || laptop.getImage().isEmpty() || laptop.getPrice().isEmpty()
				|| Double.isNaN(Double.parseDouble(laptop.getPrice())) || laptop.getProcessor().isEmpty()
				|| laptop.getRam().isEmpty() || laptop.getResolution().isEmpty() || laptop.getScreen().isEmpty()
				|| laptop.getStorage().isEmpty()) {
			message = "*Please fill in all fields properly";
		}
		if (dao.updateLaptop(laptop) != 0) {
			message = "";
		} else {
			message = "*Update Failed";
		}
		mav = new ModelAndView("redirect:admin.html");
		mav.addObject("message", message);
		return mav;
	}

}
