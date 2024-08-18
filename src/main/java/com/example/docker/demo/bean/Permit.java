package com.example.docker.demo.bean;

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
public class Permit {
	private String permitNumber;
	private int noOfStatePermits;
	private Boolean isCentrallyPermitted;
}
