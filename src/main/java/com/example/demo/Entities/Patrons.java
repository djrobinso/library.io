package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patrons")
public class Patrons {
	
	public Patrons() {
		
	}
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name = "FirstName")
	private String FirstName;
	
	@Column(name = "LastName")
	private String LastName;
	
	@Column(name = "Address")
	private String Address;
	
    @Column(name = "StudentId")
	private String StudentId;
    
    @Column(name = "DriverLiscenceNum")
	private String DriverLiscenceNum;
    
    @Column(name = "PatronType")
	private String PatronType;
    
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
