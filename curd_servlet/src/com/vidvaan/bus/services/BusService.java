package com.vidvaan.bus.services;

import java.util.List; 
import com.vidvaan.bus.model.*;

public interface BusService {
	public void insert(Bus bus);
	public void update(Bus bus);
	public void delete(int bid);
	public Bus findById(int bid);
	public List<Bus> findAll();
}


