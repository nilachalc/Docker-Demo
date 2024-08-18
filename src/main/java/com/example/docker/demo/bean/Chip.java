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
public class Chip {
	private String functionality;
	private String chipType;
	private Boolean workingCondition;
	private String avilability;
}
