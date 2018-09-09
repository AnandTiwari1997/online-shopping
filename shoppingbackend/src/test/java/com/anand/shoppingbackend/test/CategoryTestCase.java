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
	 * Method will the return list() of CategoryDAOImpl.
	 */
	@Test
	public void testListCategory() {
		assertEquals("Succesfully fetch all the category!", 3, categoryDAO.list().size());
	}

	/**
	 * Method test the Add method of CategoryDAO.
	 */
	// @Test
	// public void testAddCategory() {
	//
	// category = new Category();
	//
	// category.setName("Computer");
	// category.setDescription("Some description for the Computer.");
	// category.setImageURL("Computer_1.jpg");
	//
	// assertEquals("Succesfully added to the table!", true,
	// categoryDAO.add(category));
	//
	// category = new Category();
	//
	// category.setName("Mobile");
	// category.setDescription("Some description for the Mobile.");
	// category.setImageURL("Mobile_1.jpg");
	//
	// assertEquals("Succesfully added to the table!", true,
	// categoryDAO.add(category));
	//
	// category = new Category();
	//
	// category.setName("TV");
	// category.setDescription("Some description for the Television.");
	// category.setImageURL("Television_1.jpg");
	//
	// assertEquals("Succesfully added to the table!", true,
	// categoryDAO.add(category));
	//
	// category = new Category();
	//
	// category.setName("Laptop");
	// category.setDescription("Some description for the Laptop.");
	// category.setImageURL("Laptop_1.jpg");
	//
	// assertEquals("Succesfully added to the table!", true,
	// categoryDAO.add(category));
	// }

	/**
	 * Method will test the Read operation.
	 */
	// @Test
	// public void testGetCategory() {
	// category = categoryDAO.get(2);
	// assertEquals("Succesfully fetch all the category!", "Mobile",
	// category.getName());
	// }

	/**
	 * Method will test the update Operation.
	 */
	// @Test
	// public void testUpdateCategory() {
	//
	// category = categoryDAO.get(3);
	// category.setName("Television");
	// category.setDescription("Some description for the Television.");
	// assertEquals("Successfully Updated the category in the table!", true,
	// categoryDAO.update(category));
	// }

	/**
	 * Method will test the delete Operation.
	 */
	// @Test
	// public void testDeleteCategory() {
	// category = categoryDAO.get(1);
	// category.setActive(false);
	// assertEquals("Successfully deleted the category in the table!", true,
	// categoryDAO.delete(category));
	// }

}
