package com.app.fss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.fss.entity.Driver;
import com.app.fss.service.DriverService;

@Controller
public class DriverController {

	private DriverService driverService;
//again we do not need to add AddAll annotation because here we have 1 coonstructor
	public DriverController(DriverService driverService) {
		super();
		this.driverService = driverService;
		
		
	}
	
	
	//handler method to handle list driver request and return model andview
	@GetMapping("/drivers")
	public String listDrivers(Model model) {
		
		model.addAttribute("drivers",driverService.getAllDrivers() );
		
		return "drivers" ;
		
		
	}
	//method for adding new drivers from form
@GetMapping("/drivers/new")
	public String createDriverForm(Model model) {
	//create new driver object to hold driver form data	
	Driver driver = new Driver();
	model.addAttribute("driver", driver);
	return "create_driver" ;
		
	}

@PostMapping("/drivers")
public String saveDriver(@ModelAttribute("driver") Driver driver) {
	
	driverService.saveDriver(driver);
	return "redirect:/drivers";
	
}
//this method is for the update action. GetMapping as it is in the drivers.html template
@GetMapping("/drivers/edit/{id}")
public String editDriverForm(@PathVariable Long id, Model model) {
	model.addAttribute("driver",driverService.getDriverById(id));
	return "edit_driver";
}

@PostMapping("/drivers/{id}")	
public String updateDriver(@PathVariable Long id,
		@ModelAttribute("driver") Driver driver,
		Model model) {
	// get drivers  from databse by Id;
	Driver existingDriver = driverService.getDriverById(id);
	existingDriver.setId(id);
	existingDriver.setFirstname(driver.getFirstname());
	existingDriver.setLastname(driver.getLastname());
    //save updated driver
	driverService.updateDriver(existingDriver);
	return "redirect:/drivers";
}

//Handler method to handle driver delete request

@GetMapping("/drivers/{id}")
public String deleteDriver(@PathVariable Long id) {
	driverService.deleteDriverById(id);
	return "redirect:/drivers";
}



}
