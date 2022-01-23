package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PatronTypeTable")
public class PatronTypeTable {
	
	public PatronTypeTable() {
		//
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "PatronTypeCode")
	private String PatronTypeCode;
	
	@Column(name = "PatronType")
	private String PatronType;
	
	public String getPatronTypeCode() {
		return PatronTypeCode;
	}

	public void setPatronTypeCode(String patronTypeCode) {
		PatronTypeCode = patronTypeCode;
	}

	public String getPatronType() {
		return PatronType;
	}

	public void setPatronType(String patronType) {
		PatronType = patronType;
	}

	
	

}
