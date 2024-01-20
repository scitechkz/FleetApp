package com.app.fss.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.fss.entity.Driver;
import com.app.fss.entity.Vehicle;
import com.app.fss.repository.DriverRepository;
import com.app.fss.repository.VehicleRepository;
import com.app.fss.service.DriverService;
import com.app.fss.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	
	private VehicleRepository vehicleRepository;
	//use add all annotation if the constructor is more than 1
	
	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}


	@Override
	public List<Vehicle> getAllVehicles() {
		return vehicleRepository.findAll();
			}
	
	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	
	}
	
	@Override
	public Vehicle getVehicleById(Long id) {
		return vehicleRepository.findById(id).get();
			
	}
	
	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
				}


	@Override
	public void deleteVehicleById(Long id) {
		
		vehicleRepository.deleteById(id);
		
	}
	
	
	
	
	
}
