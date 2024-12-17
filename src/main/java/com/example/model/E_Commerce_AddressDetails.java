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

@Entity(name="E_Commerce_AddressDetails")
@Table(name="address_details")
public class E_Commerce_AddressDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private Integer addressId;
	@Column(name="address_line_1")
	private String addressLine1;
	@Column(name="address_line_2")
	private String addressLine2;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="pin_code")
	private Integer pincode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName ="user_id")
	private E_Commerce_UserDetails eCommerceUserDetails;
	
	public E_Commerce_AddressDetails() {
		super();
	}

	public E_Commerce_AddressDetails(Integer addressId, String addressLine1, String addressLine2, String city, String state,
			Integer pincode, E_Commerce_UserDetails eCommerceUserDetails) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.eCommerceUserDetails = eCommerceUserDetails;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public E_Commerce_UserDetails geteCommerceUserDetails() {
		return eCommerceUserDetails;
	}

	public void seteCommerceUserDetails(E_Commerce_UserDetails eCommerceUserDetails) {
		this.eCommerceUserDetails = eCommerceUserDetails;
	}
	
}
