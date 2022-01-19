package com.example.demo.Entities;

import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "Users")
public class Users {
	/*
	 * jdbc:h2:file:C:/data/sample
	 * **/
	
	public Users() {
		
	}
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name = "Username")
	private String Username;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "UserRole")
	private String UserRole;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Address")
	private String Address;
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	

}
