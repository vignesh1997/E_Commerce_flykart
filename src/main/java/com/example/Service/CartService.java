package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Cart;
import com.example.model.ECommerceUserDetails;
import com.example.repo.CartRepository;
@Service
public class CartService {
	@Autowired
	CartRepository cartRepo;
	public List<Cart> getAllCartDetails(){
		return cartRepo.findAll();
	}
	
	public List<Cart> getCartDetails(Integer cartId, Integer userId) {
		return cartRepo.findByTwoIds(cartId,userId);
	}
}
