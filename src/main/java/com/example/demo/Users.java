package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue
	private String Username;
	private String Password;
	private String UserRole;
	

}
