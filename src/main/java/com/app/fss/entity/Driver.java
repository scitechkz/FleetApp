package com.app.fss.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="drivers")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name",nullable=false)
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="phoneNo")
	private String PhoneNo;
	
	@Column(name="address")
	private String Address;
	
	@Column(name="licence")
	private String Licence;
	
	@Column(name="issuanceDate")
	private String IssuanceDate;
	
	//default constructor must be created after generating constructor -9 to 11
	


	public Driver() {
		
	}
	
	public Driver(String firstname, String lastname,String PhoneNo,String Address,String Licence,String IssuanceDate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.PhoneNo = PhoneNo;
		this.Address = Address;
		this.IssuanceDate = IssuanceDate;
		
	}
	
	//set setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setPhoneNo(String PhoneNo) {
		this.PhoneNo = PhoneNo ;
	}
	
	public void setAddress(String Address) {
		this.Address = Address ;
	}
	
	public void setLicence(String Licence) {
		this.Licence = Licence ;
	}
	
	
	
	public void setIssuanceDate(String IssuanceDate) {
		this.IssuanceDate = IssuanceDate ;
	}
	
	
	
	
	
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	
	public String getPhoneNo() {
		return PhoneNo;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String getLicence() {
		return Licence;
	}
	
	public String getIssuanceDate() {
		return IssuanceDate;
	}
	
	
	
	
	
	
	
	
}
