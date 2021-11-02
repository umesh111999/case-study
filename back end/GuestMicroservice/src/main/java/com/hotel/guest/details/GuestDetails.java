package com.hotel.guest.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Guest")



public class GuestDetails {
	
	
	@Id
	private String roomId;
 	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	private String guestId;
	private String guestFirstName;
	private String guestLastName;
    private String email;
    private String mobileNo;
	private String dateOfBirth;
    private String gender;
    private String company;
    private String address;
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	
	}
	
	
	
	public String getGuestFirstName() {
		return guestFirstName;
	}
	public void setGuestFirstName(String guestFirstName) {
		this.guestFirstName = guestFirstName;
	}
	public String getGuestLastName() {
		return guestLastName;
	}
	public void setGuestLastName(String guestLastName) {
		this.guestLastName = guestLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public GuestDetails() {
		super();
	}
	public GuestDetails(String roomId, String guestId, String guestFirstName, String guestLastName, String email,
			String mobileNo, String dateOfBirth, String gender, String company, String address) {
		super();
		this.roomId = roomId;
		this.guestId = guestId;
		this.guestFirstName = guestFirstName;
		this.guestLastName = guestLastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.company = company;
		this.address = address;
	}
	
	


}