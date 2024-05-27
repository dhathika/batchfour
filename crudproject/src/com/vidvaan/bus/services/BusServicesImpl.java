package com.vidvaan.bus.services;

import java.util.List;

import com.vidvaan.bus.model.Bus;
import com.vidvaan.bus.dao.*;
public class BusServicesImpl implements BusService{

	private BusDAO busDAO = new BusDAOImpl(); 
	@Override
	public void insert(Bus bus) {
		busDAO.insert(bus);
	}

	@Override
	public void update(Bus bus) {
		busDAO.update(bus);
	}

	@Override
	public void delete(int bid) {
		busDAO.delete(bid);
	}

	@Override
	public Bus findById(int bid) {
		return busDAO.findById(bid);
	}

	@Override
	public List<Bus> findAll() {
		return busDAO.findAll();
	}

}
