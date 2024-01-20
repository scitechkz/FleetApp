package com.app.fss.service;

import java.util.List;

import com.app.fss.entity.Driver;

public interface DriverService {

	List<Driver> getAllDrivers();
	
	Driver saveDriver(Driver driver);
	
	Driver getDriverById(Long id);
	Driver updateDriver(Driver driver);

	void deleteDriverById(Long id);
	
}
