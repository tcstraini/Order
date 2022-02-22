package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel,Integer>{

}