package com.anand.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.anand.shoppingbackend.dao.CategoryDAO;
import com.anand.shoppingbackend.dto.Category;

/**
 * An Implementation for the CategoryDAO.
 * 
 * @author Anand Tiwari
 *
 */
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		category.setId(1);
		category.setName("Mobile");
		category.setDescription("Some description for the Mobile.");
		category.setImageURL("Mobile_1.jpg");
		category.setActive(true);

		categories.add(category);

		category = new Category();

		category.setId(2);
		category.setName("Television");
		category.setDescription("Some description for the Television.");
		category.setImageURL("Television_1.jpg");
		category.setActive(true);

		categories.add(category);

		category = new Category();

		category.setId(3);
		category.setName("Computer");
		category.setDescription("Some description for the Computer.");
		category.setImageURL("Computer_1.jpg");
		category.setActive(true);

		categories.add(category);

		category = new Category();

		category.setId(4);
		category.setName("Laptop");
		category.setDescription("Some description for the Laptop.");
		category.setImageURL("Laptop_1.jpg");
		category.setActive(true);

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
