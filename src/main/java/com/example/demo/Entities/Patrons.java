package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patrons {
	
	public Patrons() {
		
	}
	
	@Id
	@Column
	public String FirstName;
	@Column
	public String LastName;
	@Column
	public String Address;
    @Column
	public String StudentId;
    @Column
	public String DriverLiscenceNum;
    @Column
	public String PatronType;
    
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getDriverLiscenceNum() {
		return DriverLiscenceNum;
	}
	public void setDriverLiscenceNum(String driverLiscenceNum) {
		DriverLiscenceNum = driverLiscenceNum;
	}
	public String getPatronType() {
		return PatronType;
	}
	public void setPatronType(String patronType) {
		PatronType = patronType;
	}

}