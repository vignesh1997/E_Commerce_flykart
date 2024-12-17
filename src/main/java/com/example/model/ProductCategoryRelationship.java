package com.example.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="ProductCategoryRelationship")
@Table(name="product_category_relationship")
public class ProductCategoryRelationship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_category_relationship_id")
	private Integer productCategoryRelationshipId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id",referencedColumnName ="product_id")
	private Product productId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id",referencedColumnName ="category_id")
	private Category categoryId;
	
	public ProductCategoryRelationship(Integer productCategoryRelationshipId, Product productId, Category categoryId) {
		super();
		this.productCategoryRelationshipId = productCategoryRelationshipId;
		this.productId = productId;
		this.categoryId = categoryId;
	}
	
	public ProductCategoryRelationship() {
		
	}

	public Integer getproductCategoryRelationshipId() {
		return productCategoryRelationshipId;
	}

	public void setproductCategoryRelationshipId(Integer productCategoryRelationshipId) {
		this.productCategoryRelationshipId = productCategoryRelationshipId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
