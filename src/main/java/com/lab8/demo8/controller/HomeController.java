package com.lab8.demo8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/","/home/index"})
	public String home() {
		return "redirect:/product/list";
	}
	@RequestMapping({"/admin","/admin/home/index"})
	public String admin() {
		return "redirect:/admin/index.html";
	}
	
}
