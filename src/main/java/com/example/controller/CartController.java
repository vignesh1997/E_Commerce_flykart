package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CartService;
import com.example.model.Cart;
@RestController
public class CartController {

	@Autowired
	CartService cartService;
	
	@GetMapping("/getAllCartDetails")
	public List<Cart> toGetAllCartDetailsFromDB(){
		return cartService.getAllCartDetails();
	}
}
