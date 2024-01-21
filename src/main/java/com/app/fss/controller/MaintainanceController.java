package com.app.fss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.fss.entity.Driver;
import com.app.fss.entity.Maintainance;
import com.app.fss.entity.Vehicle;
import com.app.fss.service.DriverService;
import com.app.fss.service.MaintainanceService;
import com.app.fss.service.VehicleService;

@Controller
public class MaintainanceController {

	private MaintainanceService maintainanceService;

	public MaintainanceController(MaintainanceService maintainanceService) {
		super();
		this.maintainanceService = maintainanceService;
		
		
	}
	
	
	//handler method to handle list maintainance request and return model andview
	@GetMapping("/maintainance")
	public String listMaintainance(Model model) {
		
		model.addAttribute("maintainance",maintainanceService.getAllMaintainance() );
		
		return "maintainance" ;
		
		}
	
//	//method for adding new vehicles from form
@GetMapping("/maintainance/new")
	public String createMaintainanceForm(Model model) {
//	//create new driver object to hold driver form data	
	Maintainance maintainance = new Maintainance();
model.addAttribute("maintainance", maintainance);
	return "edit_maintaince" ;
		
}


		/*
		 * //@PostMapping("/maintainance") //public String
		 * saveMaintainance(@ModelAttribute("maintainance") Maintainance vehicle) { //
		 * // maintainanceService.saveMaintainance(maintainance); // return
		 * "redirect:/vehicles"; //} ////this method is for the update action.
		 * GetMapping as it is in the vehicles.html template
		 * //@GetMapping("/vehicles/edit/{id}") //public String
		 * editVehicleForm(@PathVariable Long id, Model model) { //
		 * model.addAttribute("vehicle",vehicleService.getVehicleById(id)); // return
		 * "edit_vehicle"; //}
		 */


@PostMapping("/maintainance/{id}")	
public String updateMaintainace(@PathVariable Long id,
		@ModelAttribute("maintainance") Maintainance maintainance,
		Model model) {
	// get vehicle  from database by Id;
	Maintainance lastMaintainance = maintainanceService.getMaintainanceById(id);
	lastMaintainance.setId(id);
	lastMaintainance.setVehicleNo(maintainance.getVehicleNo());
	lastMaintainance.setVehicleLocation(maintainance.getVehicleLocation());
	lastMaintainance.setPmCost(maintainance.getPmCost());
	lastMaintainance.setPmDate(maintainance.getPmDate());
	lastMaintainance.setVehicleManufacturer(maintainance.getVehicleManufacturer());
	lastMaintainance.setVehicleModel(maintainance.getVehicleModel());
	
	//save updated vehicle
	maintainanceService.updateMaintainance(lastMaintainance);
	return "redirect:/maintainance";
}





}
