package com.app.fss.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.fss.entity.Driver;
import com.app.fss.entity.Maintainance;
import com.app.fss.entity.Vehicle;
import com.app.fss.repository.DriverRepository;
import com.app.fss.repository.MaintainanceRepository;
import com.app.fss.repository.VehicleRepository;
import com.app.fss.service.DriverService;
import com.app.fss.service.MaintainanceService;
import com.app.fss.service.VehicleService;

@Service
public class MaintainanceServiceImpl implements MaintainanceService {

	
	private MaintainanceRepository maintainanceRepository;
	//use add all annotation if the constructor is more than 1
	
	public MaintainanceServiceImpl(MaintainanceRepository maintainanceRepository) {
		super();
		this.maintainanceRepository = maintainanceRepository;
	}


	@Override
	public List<Maintainance> getAllMaintainance() {
		return maintainanceRepository.findAll();
			}
	
	@Override
	public Maintainance saveMaintainance(Maintainance maintainance) {
		return maintainanceRepository.save(maintainance);
	
	}
	
	@Override
	public Maintainance getMaintainanceById(Long id) {
		return maintainanceRepository.findById(id).get();
			
	}
	
	@Override
	public Maintainance updateMaintainance(Maintainance maintainance) {
		return maintainanceRepository.save(maintainance);
				}



	
	
	
}
