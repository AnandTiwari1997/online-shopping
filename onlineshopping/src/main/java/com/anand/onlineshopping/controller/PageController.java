package com.anand.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anand.shoppingbackend.dao.CategoryDAO;
import com.anand.shoppingbackend.dto.Category;

/**
 * Front Controller.
 * 
 * @author Anand Tiwari
 *
 */
@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	/**
	 * 
	 * @return ModelAndView object
	 */
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome", true);
		return mv;
	}

	/**
	 * 
	 * @return ModelAndView object
	 */
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	/**
	 * 
	 * @return ModelAndView object
	 */
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/**
	 * 
	 * @return ModelAndView object
	 */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProduct() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	/**
	 * @param id index of the category.
	 * @return ModelAndView object
	 */
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProduct(@PathVariable(value="id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		Category category = categoryDAO.get(id);
		
		mv.addObject("title", category.getName());
		mv.addObject("category", category);
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
}
