package com.app.fss.service;

import java.util.List;

import com.app.fss.entity.Driver;
import com.app.fss.entity.Vehicle;

public interface VehicleService {

	List<Vehicle> getAllVehicles();
	
	Vehicle saveVehicle(Vehicle vehicle);
	
	Vehicle getVehicleById(Long id);
	Vehicle updateVehicle(Vehicle vehicle);

	void deleteVehicleById(Long id);
	
}
