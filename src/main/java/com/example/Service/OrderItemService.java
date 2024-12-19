package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.OrderItem;
import com.example.repo.OrderItemRepository;
@Service
public class OrderItemService {
	
	@Autowired
	OrderItemRepository orderItemRepo;
	
	public List<OrderItem> toGetAllOrderItem(){
		return orderItemRepo.findAll();
	}
	
	public String toAddOrderItem(OrderItem orderItem) {
		orderItemRepo.save(orderItem);
		return "orderitem data added successfully";
	}
	
}
