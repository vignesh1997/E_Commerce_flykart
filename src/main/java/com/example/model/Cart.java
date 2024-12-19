package com.example.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="Cart")
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cart_id")
	private Integer cartId;
	@Column(name="total_price")
	private double totalPrice;
	@Column(name="total_tax")
	private double totalTax;
	@Column(name="delivery_status")
	private String deliveryStatus;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id",referencedColumnName ="address_id")
	private E_Commerce_AddressDetails addressId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName = "user_id")
	private E_Commerce_UserDetails userId;
	
	public Cart() {
		super();
	}

	public Cart(Integer cartId, double totalPrice, double totalTax, String deliveryStatus,
			E_Commerce_AddressDetails addressId, E_Commerce_UserDetails userId) {
		super();
		this.cartId = cartId;
		this.totalPrice = totalPrice;
		this.totalTax = totalTax;
		this.deliveryStatus = deliveryStatus;
		this.addressId = addressId;
		this.userId = userId;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public E_Commerce_AddressDetails getAddressId() {
		return addressId;
	}

	public void setAddressId(E_Commerce_AddressDetails addressId) {
		this.addressId = addressId;
	}

	public E_Commerce_UserDetails getUserId() {
		return userId;
	}

	public void setUserId(E_Commerce_UserDetails userId) {
		this.userId = userId;
	}
	
	
}
