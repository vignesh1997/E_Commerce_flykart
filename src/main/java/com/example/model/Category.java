package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Category")
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="category_id")
	private Integer categoryId;
	@Column(name="category_name")
	private String category_name;
	@Column(name="category_description")
	private String category_description;
	
	public Category(Integer categoryId, String category_name, String category_description) {
		super();
		this.categoryId = categoryId;
		this.category_name = category_name;
		this.category_description = category_description;
	}
	
	public Category() {
		
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_description() {
		return category_description;
	}

	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}
	
	
}
