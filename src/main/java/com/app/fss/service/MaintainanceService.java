package com.app.fss.service;

import java.util.List;

import com.app.fss.entity.Driver;
import com.app.fss.entity.Maintainance;
import com.app.fss.entity.Vehicle;

public interface MaintainanceService {

	List<Maintainance> getAllMaintainance();
	
	Maintainance saveMaintainance(Maintainance maintainance);
	
	Maintainance getMaintainanceById(Long id);
	Maintainance updateMaintainance(Maintainance maintainance);

	//void deleteVehicleById(Long id);
	
}
