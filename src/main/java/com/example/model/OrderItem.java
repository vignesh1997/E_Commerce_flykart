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

@Entity(name="OrderItem")
@Table(name="order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_item_id")
	private Integer orderItemId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id",referencedColumnName ="product_id")
	private Product productId;
    @Column(name="price")
	private Double price;
    @Column(name="tax")
	private Double tax;
    @Column(name="quantity")
	private Integer quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id",referencedColumnName ="cart_id")
	private Cart cartId;
	public OrderItem(Integer orderItemId, Product productId, Double price, Double tax, Integer quantity, Cart cartId) {
		super();
		this.orderItemId = orderItemId;
		this.productId = productId;
		this.price = price;
		this.tax = tax;
		this.quantity = quantity;
		this.cartId = cartId;
	}
	public OrderItem() {
		super();
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Cart getCartId() {
		return cartId;
	}
	public void setCartId(Cart cartId) {
		this.cartId = cartId;
	}
	
    
    
}
