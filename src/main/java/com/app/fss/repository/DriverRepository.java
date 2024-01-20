package com.app.fss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.fss.entity.Driver;

//entory object name and the type . see id in the entity object
public interface DriverRepository extends JpaRepository<Driver, Long > {
	
	

}
