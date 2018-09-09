package com.anand.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.shoppingbackend.dao.CategoryDAO;
import com.anand.shoppingbackend.dto.Category;

/**
 * Test Class for CategoryDAO.
 * 
 * @author Anand Tiwari
 *
 */
public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	/**
	 * Method runs before class.
	 */
	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.anand.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/**
	 * Method test the Add method of CategoryDAO.
	 */
	// @Test
	// public void testAddCategory() {
	//
	// category = new Category();
	//
	// category.setName("Television");
	// category.setDescription("Some description for the Television.");
	// category.setImageURL("Television_1.jpg");
	//
	// assertEquals("Succesfully added to the table!", true,
	// categoryDAO.add(category));
	//
	// }
	
	/**
	 * Method will the return list() of CategoryDAOImpl.
	 */
	@Test
	public void testListCategory() {
		assertEquals("Succesfully fetch all the category!", 4, categoryDAO.list().size());
	}
	
	/**
	 * Method will the return the specified category.
	 */
	// @Test
	// public void testGetCategory() {
	// category = categoryDAO.get(1);
	// assertEquals("Succesfully fetch all the category!", "Mobile",
	// category.getName());
	// }

}
