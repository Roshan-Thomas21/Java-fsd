package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.EProduct;
import com.ecommerce.dao.EProductDAO;

@Controller
public class TableController {

	@Autowired
	EProductDAO eproductDAO;
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@RequestParam String price) {
		eproductDAO.addProduct(name, price);

		return "addProductSuccess"; // go to addProductSuccess.jsp
	}
}