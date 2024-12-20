package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CartService;
import com.example.model.Cart;
import com.example.model.ECommerceUserDetails;
@RestController
public class CartController {

	@Autowired
	CartService cartService;
	
	@GetMapping("/getAllCartDetails")
	public List<Cart> toGetAllCartDetailsFromDB(){
		return cartService.getAllCartDetails();
	}
	@GetMapping("/getOneCartObject")
	public List<Cart> getOneCartDetails(@RequestParam("cartId") String cartId, @RequestParam("userId") String userId) {
		System.out.println(cartId+" "+userId);
		return cartService.getCartDetails(Integer.parseInt(cartId), Integer.parseInt(userId));
	}
}
