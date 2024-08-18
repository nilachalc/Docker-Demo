package com.example.docker.demo.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
	private int vehicleId;
	private String name;
	private String makingCompany;
	private String vIN;
	private String enginNumber;
	private int enginCapasity;
	private int wheeler;
	private String gearType;
	List<Chip> chipSets;
}
