package com.app.fss.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.fss.entity.Driver;
import com.app.fss.repository.DriverRepository;
import com.app.fss.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	
	private DriverRepository driverRepository;
	//use add all annotation if the constructor is more than 1
	
	public DriverServiceImpl(DriverRepository driverRepository) {
		super();
		this.driverRepository = driverRepository;
	}


	@Override

	public List<Driver> getAllDrivers() {
		return driverRepository.findAll();
		
	}
	
	@Override
	public Driver saveDriver(Driver driver) {
		return driverRepository.save(driver);
		
	}
	
	@Override
	public Driver getDriverById(Long id) {
		return driverRepository.findById(id).get();
			
	}
	
	@Override
	public Driver updateDriver(Driver driver) {
		return driverRepository.save(driver);
			
	}


	@Override
	public void deleteDriverById(Long id) {
		// TODO Auto-generated method stub
		driverRepository.deleteById(id);
		
	}
	
	
	
	
	
}
