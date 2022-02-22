package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HotelRepository;
import com.example.demo.entity.Hotel;

@Service
public class HotelService {

	@Autowired
	HotelRepository orderRepository;

	public Iterable<Hotel> getOrders() {

		return orderRepository.findAll();
	}

	public void saveOrder(Hotel order) {

		orderRepository.save(order);

	}

}