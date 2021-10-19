package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Deyonta
 *
 */

@Entity
@Table
public class Book {
	
	@Id
	@Column
	String title;
	@Column
	String authorFirstName;
	@Column
	String authorLastName;
	@Column
	String ISN_Number;
	@Column
	LocalDate publicationDate;
	@Column
	Boolean IsCheckedOut;
	@Column
	LocalDateTime checkedOutDate;
	@Column
	LocalDateTime checkedInDate;
	@Column
	Boolean checkInDate;
	@Column
	Boolean IsCheckedIn;
	@Column
	
	Boolean IsOverdue;
	@Column
	LocalDate checkInByDate;
	@Column
	Boolean IsLate;
	
	
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
		return ISN_Number;
	}
	
	public void setISN_Number(String iSN_Number) {
		ISN_Number = iSN_Number;
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
