package com.lab8.demo8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingCartController {
	@RequestMapping("/cart/view")
	public String view() {
		return "cart/view";
	}
	
	
}
