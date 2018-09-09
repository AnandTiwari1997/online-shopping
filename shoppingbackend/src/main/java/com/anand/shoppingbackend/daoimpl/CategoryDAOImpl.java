package com.anand.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anand.shoppingbackend.dao.CategoryDAO;
import com.anand.shoppingbackend.dto.Category;

/**
 * An Implementation for the CategoryDAO.
 * 
 * @author Anand Tiwari
 *
 */
@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	private static Logger logger = Logger.getLogger(CategoryDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Category> list() {

		String selectActiveCategory = "FROM Category WHERE active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);

		return query.getResultList();
	}

	@Override
	public Category get(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		try {
			logger.info("Creating New Category.... " + category);
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return false;
	}

}
