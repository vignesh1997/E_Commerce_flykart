package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Product")
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer producId;
	@Column(name="product_name")
	private String productName;
	@Column(name="list_price")
	private Integer listPrice;
	@Column(name="sale_price")
	private Integer salePrice;
	@Column(name="product_img_url")
	private String productImageUrl;
	@Column(name="product_description")
	private String productDescription;
	
	public Product(Integer producId, String productName, Integer listPrice, Integer salePrice, String productImageUrl,
			String productDescription) {
		super();
		this.producId = producId;
		this.productName = productName;
		this.listPrice = listPrice;
		this.salePrice = salePrice;
		this.productImageUrl = productImageUrl;
		this.productDescription = productDescription;
	}

	public Product() {
		super();
	}

	public Integer getProducId() {
		return producId;
	}

	public void setProducId(Integer producId) {
		this.producId = producId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getListPrice() {
		return listPrice;
	}

	public void setListPrice(Integer listPrice) {
		this.listPrice = listPrice;
	}

	public Integer getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
}
