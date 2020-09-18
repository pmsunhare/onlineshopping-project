package com.pmsunhare.onlineshoppingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //it says - this will help all the other request mapping inside this controller
public class PageController {

	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to the Spring MVC");
		
		return mv;
	}
}
