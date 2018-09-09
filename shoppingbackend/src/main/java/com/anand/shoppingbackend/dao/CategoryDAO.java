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
	 * @param id
	 *            index of category.
	 * @return category object.
	 */
	Category get(int id);

	/**
	 * Adding new Category to database.
	 * 
	 * @param category
	 *            Category Object.
	 * @return boolean true or false.
	 */
	boolean add(Category category);

	/**
	 * Updating the category.
	 * 
	 * @param category
	 *            Category Object.
	 * @return true or false.
	 */
	boolean update(Category category);

	/**
	 * Delete the category.
	 * 
	 * @param category
	 *            Category Object.
	 * @return true or false.
	 */
	boolean delete(Category category);

}
