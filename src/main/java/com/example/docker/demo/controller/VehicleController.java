package com.example.docker.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.demo.bean.Vehicle;
import com.example.docker.demo.exception.VehicleNotFoundException;
import com.example.docker.demo.service.VehicleService;

@RestController
@RequestMapping(path = "/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService; 
	
	@GetMapping(path = "/getAllVehicles")
	public List<Vehicle> getAllVehicleDetails() {
		return vehicleService.getAllVehicles();
	}
	
	@GetMapping(path = "/getVehicle/{vehicleId}")
	public Vehicle getAllVehicleDetails(@PathVariable int vehicleId) throws VehicleNotFoundException {
		return vehicleService.getVehicle(vehicleId);
	}
}
