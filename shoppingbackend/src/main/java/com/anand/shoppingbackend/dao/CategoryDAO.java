package com.anand.shoppingbackend.dao;

import java.util.List;

import com.anand.shoppingbackend.dto.Category;

/**
 * An Interface for CategoryDAO.
 * 
 * @author Anand Tiwari
 *
 */
public interface CategoryDAO {
	
	/**
	 * 
	 * @return list of the category.
	 */
	List<Category> list();
	
	/**
	 * 
	 * @param id index of category.
	 * @return category object.
	 */
	Category get(int id);
	
}
