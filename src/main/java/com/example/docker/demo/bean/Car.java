package com.example.docker.demo.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@NoArgsConstructor
public class Car extends Vehicle {
	private String carColor;
	private String carVarient;
	private Boolean sterioInstalled;
	private List<String> valueAddedServices;
}
