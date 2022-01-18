package com.example.demo.Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Deyonta
 *
 */

@Entity
@Table(name = "Book")
public class Book {
	
	public Book() {
		
	}
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name ="title")
	private String title;
	
	@Column(name ="authorFirstName")
	private String authorFirstName;
	
	@Column(name ="authorLastName")
	private String authorLastName;
	
	@Column(name ="ISB_Number")
	private String ISB_Number;
	
	@Column(name ="publicationDate")
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate publicationDate;
	
	@Column(name ="IsCheckedOut")
	private Boolean IsCheckedOut;
	
	@Column(name ="checkedOutDate")
	private LocalDateTime checkedOutDate;
	
	@Column(name ="checkedInDate")
	private LocalDateTime checkedInDate;
	
	@Column(name ="checkInDate")
	private Boolean checkInDate;
	
	@Column(name ="IsCheckedIn")
	private Boolean IsCheckedIn;
	
	@Column(name ="IsOverdue")
	private Boolean IsOverdue;
	
	@Column(name ="checkInByDate")
	private LocalDate checkInByDate;
	
	@Column(name ="IsLate")
	private Boolean IsLate;
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	
	public String getAuthorLastName() {
		return authorLastName;
	}
	
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	
	public String getISN_Number() {
		return ISB_Number;
	}
	
	public void setISN_Number(String iSN_Number) {
		ISB_Number = iSN_Number;
	}
	
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
	
	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public Boolean getIsCheckedOut() {
		return IsCheckedOut;
	}
	
	public void setIsCheckedOut(Boolean isCheckedOut) {
		IsCheckedOut = isCheckedOut;
	}
	
	public LocalDateTime getCheckedOutDate() {
		return checkedOutDate;
	}
	
	public void setCheckedOutDate(LocalDateTime checkedOutDate) {
		this.checkedOutDate = checkedOutDate;
	}
	
	public LocalDateTime getCheckedInDate() {
		return checkedInDate;
	}
	
	public void setCheckedInDate(LocalDateTime checkedInDate) {
		this.checkedInDate = checkedInDate;
	}
	
	public Boolean getCheckInDate() {
		return checkInDate;
	}
	
	public void setCheckInDate(Boolean checkInDate) {
		this.checkInDate = checkInDate;
	}
	
	public Boolean getIsCheckedIn() {
		return IsCheckedIn;
	}
	
	public void setIsCheckedIn(Boolean isCheckedIn) {
		IsCheckedIn = isCheckedIn;
	}
	
	public Boolean getIsOverdue() {
		return IsOverdue;
	}
	
	public void setIsOverdue(Boolean isOverdue) {
		IsOverdue = isOverdue;
	}
	
	public LocalDate getCheckInByDate() {
		return checkInByDate;
	}
	
	public void setCheckInByDate(LocalDate checkInByDate) {
		this.checkInByDate = checkInByDate;
	}
	
	public Boolean getIsLate() {
		return IsLate;
	}
	
	public void setIsLate(Boolean isLate) {
		IsLate = isLate;
	}
	
	public String getAuthorFullName() {
		return this.authorFirstName + " " + this.authorLastName;
	}
}
