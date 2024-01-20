package com.app.fss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.fss.entity.Driver;
import com.app.fss.entity.Vehicle;
import com.app.fss.service.DriverService;
import com.app.fss.service.VehicleService;

@Controller
public class VehicleController {

	private VehicleService vehicleService;
//again we do not need to add AddAll annotation because here we have 1 coonstructor
	public VehicleController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
		
		
	}
	
	
	//handler method to handle list vehicle request and return model andview
	@GetMapping("/vehicles")
	public String listVehicles(Model model) {
		
		model.addAttribute("vehicles",vehicleService.getAllVehicles() );
		
		return "vehicles" ;
		
		}
	
	//method for adding new vehciles from form
@GetMapping("/vehicles/new")
	public String createVehicleForm(Model model) {
	//create new driver object to hold driver form data	
	Vehicle vehicle = new Vehicle();
	model.addAttribute("vehicle", vehicle);
	return "create_vehicle" ;
		
	}


@PostMapping("/vehicles")
public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
	
	vehicleService.saveVehicle(vehicle);
	return "redirect:/vehicles";
}
//this method is for the update action. GetMapping as it is in the vehicles.html template
@GetMapping("/vehicles/edit/{id}")
public String editVehicleForm(@PathVariable Long id, Model model) {
	model.addAttribute("vehicle",vehicleService.getVehicleById(id));
	return "edit_vehicle";
}



@PostMapping("/vehicles/{id}")	
public String updateVehicle(@PathVariable Long id,
		@ModelAttribute("vehicle") Vehicle vehicle,
		Model model) {
	// get vehicle  from database by Id;
	Vehicle existingVehicle = vehicleService.getVehicleById(id);
	existingVehicle.setId(id);
	existingVehicle.setVehicleNo(vehicle.getVehicleNo());
	existingVehicle.setVehicleLocation(vehicle.getVehicleLocation());
	existingVehicle.setVehicleStatus(vehicle.getVehicleStatus());
	existingVehicle.setVehicleVendor(vehicle.getVehicleVendor());
	existingVehicle.setVehicleManufacturer(vehicle.getVehicleManufacturer());
	existingVehicle.setVehicleModel(vehicle.getVehicleModel());
	
	//save updated vehicle
	vehicleService.updateVehicle(existingVehicle);
	return "redirect:/vehicles";
}


//Handler method to handle driver delete request

@GetMapping("/vehicles/{id}")
public String deleteVehicle(@PathVariable Long id) {
	vehicleService.deleteVehicleById(id);
	return "redirect:/vehicles";
}



}
