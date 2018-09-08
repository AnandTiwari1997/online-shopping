package com.anand.shoppingbackend.dto;

/**
 * Data Transfer Object Class.
 * 
 * @author Anand Tiwari
 *
 */
public class Category {

	/**
	 * Private Fields.
	 */
	private int id;
	private String name;
	private String description;
	private String imageURL;
	private boolean active;

	/**
	 * SETTER AND GETTER
	 */

	/**
	 * 
	 * @return id an integer id.
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            an integer id.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return category String name of the category.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            name of the category.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return description of the category.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            about the category.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return imageURL of the category.
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * 
	 * @param imageURL
	 *            of the category.
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	/**
	 * 
	 * @return whether category active or not.
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * 
	 * @param active
	 *            true or false for the category.
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

}
