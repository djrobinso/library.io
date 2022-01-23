package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserRole")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name= "UserRoleCode")
	private String UserRoleCode;
	
	@Column(name= "UserRoleAuthentication")
	private String UserRoleAuthentication;

	public String getUserRoleCode() {
		return UserRoleCode;
	}

	public void setUserRoleCode(String userRoleCode) {
		UserRoleCode = userRoleCode;
	}

	public String getUserRoleAuthentication() {
		return UserRoleAuthentication;
	}

	public void setUserRoleAuthentication(String userRoleAuthentication) {
		UserRoleAuthentication = userRoleAuthentication;
	}
	
	

}
