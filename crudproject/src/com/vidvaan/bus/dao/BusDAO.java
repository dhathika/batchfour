package com.vidvaan.bus.dao;

import java.util.List; 

import com.vidvaan.bus.model.Bus;

public interface BusDAO {
	public void insert(Bus bus);
	public void update(Bus bus);
	public void delete(int bid);
	public Bus findById(int bid);
	public List<Bus> findAll();
}

