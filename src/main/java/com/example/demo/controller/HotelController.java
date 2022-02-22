package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hotel;
import com.example.demo.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService orderService;

	@GetMapping("/hotel")
	Iterable<Hotel> getOrders() {
		return orderService.getOrders();
	}

	@PostMapping("/hotel") // create
	void createOrder(@RequestBody Hotel order) {
		orderService.saveOrder(order);
	}
}
