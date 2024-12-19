package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.OrderItemService;
import com.example.model.OrderItem;
@RestController
public class OrderItemController {

	@Autowired
	OrderItemService orderItemService;
	
	@GetMapping("/toGetAlltoGetAllOrderItem")
	public List<OrderItem> toGetAlltoGetAllOrderItemFromDB(){
		return orderItemService.toGetAllOrderItem();
	}
	@PostMapping("/addOrderItem")
	public String toAddOrderItemInDB(@RequestBody OrderItem i) {
		return orderItemService.toAddOrderItem(i);
	}
}
