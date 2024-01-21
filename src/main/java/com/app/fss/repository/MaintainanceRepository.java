package com.app.fss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.fss.entity.Driver;
import com.app.fss.entity.Maintainance;
import com.app.fss.entity.Vehicle;

//entity object name and the type . see id in the entity object
public interface MaintainanceRepository extends JpaRepository<Maintainance, Long > {
	
	
}
