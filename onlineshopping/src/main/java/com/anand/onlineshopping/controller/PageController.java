package com.anand.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Front Controller.
 * @author Anand Tiwari
 *
 */
@Controller
public class PageController {

	/**
	 * 
	 * @return ModelAndView object
	 */
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;
	}
}
