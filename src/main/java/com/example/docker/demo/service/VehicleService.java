package com.example.docker.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.docker.demo.bean.Car;
import com.example.docker.demo.bean.Chip;
import com.example.docker.demo.bean.Permit;
import com.example.docker.demo.bean.Truck;
import com.example.docker.demo.bean.Vehicle;
import com.example.docker.demo.exception.VehicleNotFoundException;

@Service
public class VehicleService {
	
	private static List<Vehicle> vehicles = new ArrayList<>();
	
	static {
		List<String> valueAddedServices = List.of("RSA", "SOT", "EW");
		List<Chip> chips = List.of(new Chip("Antilock Bracking System", "ABS", true, "Avalable In Market")
								, new Chip("Electronic Break Distributor", "EBD", true, "Avalable In Market")
								, new Chip("Electronic Stability Program", "ESP", false, "Avalable In Market")
								, new Chip("Tracton Control", "TC", true, "Unavalable In Market"));
		List<Permit> permits = List.of(new Permit("101", 8, false));
		
		Car car1 = new Car();
		car1.setVehicleId(1);
		car1.setName("Venue");
		car1.setVIN("AHGT7786NH");
		car1.setEnginNumber("GPW556FV45590F");
		car1.setGearType("automatic");
		car1.setMakingCompany("Hyundai");
		car1.setWheeler(4);
		car1.setEnginCapasity(1000);
		car1.setChipSets(chips);
		car1.setCarColor("Deep Forest");
		car1.setCarVarient("SX+ Turbo DCT");
		car1.setSterioInstalled(true);
		car1.setValueAddedServices(valueAddedServices);
		
		Car car2 = new Car();
		car2.setVehicleId(2);
		car2.setName("Amaze");
		car2.setVIN("YUJH6754GN9");
		car2.setEnginNumber("GPW5485MNJU235X");
		car2.setGearType("manual");
		car2.setMakingCompany("Honda");
		car2.setWheeler(4);
		car2.setEnginCapasity(1200);
		car2.setChipSets(chips);
		car2.setCarColor("Meteoroid grey");
		car2.setCarVarient("VX");
		car2.setSterioInstalled(true);
		car2.setValueAddedServices(valueAddedServices);
		
		Truck truck = new Truck();
		truck.setVehicleId(3);
		truck.setName("ACE - Chota Hati");
		truck.setVIN("P6758V7569890T");
		truck.setEnginNumber("GP988679HJ90X");
		truck.setGearType("manual");
		truck.setMakingCompany("Tata");
		truck.setWheeler(4);
		truck.setEnginCapasity(1000);
		truck.setChipSets(chips);
		truck.setLoadingCapasity(200);
		truck.setPermits(permits);
		truck.setBookedInMonth(16);
		
		vehicles.add(car1);
		vehicles.add(car2);
		vehicles.add(truck);
	}
	
	public List<Vehicle> getAllVehicles() {
		return VehicleService.vehicles;		
	}
	
	public Vehicle getVehicle(int id) throws VehicleNotFoundException {
		try {
			return VehicleService.vehicles.stream().filter(v -> v.getVehicleId() == id).findAny().get();
		} catch (Exception e) {
			throw new VehicleNotFoundException("No Vehicles Found with this ID.");
		}
	}
}
