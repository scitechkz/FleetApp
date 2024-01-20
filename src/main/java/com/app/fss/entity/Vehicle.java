package com.app.fss.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="vehicles")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Vehicle_No",nullable=false)
	private String VehicleNo;
	
	@Column(name="Vehicle_Location")
	private String VehicleLocation;
	
	@Column(name="Vehicle_Status")
	private String VehicleStatus;
	
	@Column(name="Vehicle_Vendor")
	private String VehicleVendor;
	
	@Column(name="Vehicle_Manufacturer")
	private String VehicleManufacturer;
	
	@Column(name="Vehicle_Model")
	private String VehicleModel;
	
	
	//default constructor must be created after generating constructor -9 to 11
	


	public Vehicle() {
		
	}
	
	public Vehicle(String VehicleNo, String VehicleLocation, String VehicleStatus,String VehicleVendor, String VehicleManufacturer, String VehicleModel) 
	{
		super();
		this.VehicleNo = VehicleNo;
		this.VehicleLocation = VehicleLocation;
		this.VehicleStatus= VehicleStatus;
		this.VehicleVendor= VehicleVendor;
		this.VehicleManufacturer=VehicleManufacturer;
		this.VehicleModel=VehicleModel;
		
		
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	//set methods
	
	public void setVehicleNo(String VehicleNo) {
		this.VehicleNo = VehicleNo ;
	}
	
	public void setVehicleLocation(String VehicleLocation) {
		this.VehicleLocation = VehicleLocation ;
	}


	public void setVehicleStatus(String VehicleStatus) {
		this.VehicleStatus = VehicleStatus ;
	}

	
	public void setVehicleVendor(String VehicleVendor) {
		this.VehicleVendor = VehicleVendor ;
	}
	
	public void setVehicleManufacturer(String VehicleManufacturer) {
		this.VehicleManufacturer = VehicleManufacturer ;
	}
	
	public void setVehicleModel(String VehicleModel) {
		this.VehicleModel = VehicleModel ;
	}
	
	
	//get methods
	
	public String getVehicleNo() {
		return VehicleNo;
	}
	
	
	public String getVehicleLocation() {
		return VehicleLocation;
	}
	
	
	
	public String getVehicleStatus() {
		return VehicleStatus;
	}


	public String getVehicleVendor() {
		return VehicleVendor;
	}
	
	public String getVehicleManufacturer() {
		return VehicleManufacturer;
	}
	
	public String getVehicleModel() {
		return VehicleModel;
	
	
	}
	
	
	
	}
	
	
	

