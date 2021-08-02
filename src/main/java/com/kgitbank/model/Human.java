package com.kgitbank.model;

import org.springframework.stereotype.Component;

import com.kgitbank.practice.HelloContrller;

import lombok.Data;

@Data
@Component
public class Human {
	
	String name;
	int age;
}
