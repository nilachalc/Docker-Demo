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
public class Truck extends Vehicle {
	private int loadingCapasity;
	private int bookedInMonth;
	List<Permit> permits;
}
