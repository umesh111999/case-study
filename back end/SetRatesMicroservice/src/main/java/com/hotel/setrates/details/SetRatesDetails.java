package com.hotel.setrates.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SetRating")
public class SetRatesDetails {
	@Id
	
	private String Id;
	private String roomId;
	private String Checkin;
	private String Checkout;
	private String  Guest;
	private String dayprice;
	private String onenightprice;
	private String Extensionprice;
	private String totalcost;
	
	
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(String totalcost) {
		this.totalcost = totalcost;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getCheckin() {
		return Checkin;
	}
	public void setCheckin(String checkin) {
		Checkin = checkin;
	}
	public String getGuestId() {
		return roomId;
	}
	public void setGuestId(String roomId) {
		this.roomId = roomId;
	}
	public String getCheckout() {
		return Checkout;
	}
	public void setCheckout(String checkout) {
		Checkout = checkout;
	}
	public String getGuest() {
		return Guest;
	}
	public void setGuest(String guest) {
		Guest = guest;
	}
	public String getDayprice() {
		return dayprice;
	}
	public void setDayprice(String dayprice) {
		this.dayprice = dayprice;
	}
	public String getOnenightprice() {
		return onenightprice;
	}
	public void setOnenightprice(String onenightprice) {
		this.onenightprice = onenightprice;
	}
	public String getExtensionprice() {
		return Extensionprice;
	}
	public void setExtensionprice(String extensionprice) {
		Extensionprice = extensionprice;
	}
	
	
	public SetRatesDetails(String id, String roomId, String checkin, String checkout, String guest, String dayprice,
			String onenightprice, String extensionprice, String totalcost) {
		super();
		Id = id;
		this.roomId = roomId;
		Checkin = checkin;
		Checkout = checkout;
		Guest = guest;
		this.dayprice = dayprice;
		this.onenightprice = onenightprice;
		Extensionprice = extensionprice;
		this.totalcost = totalcost;
	}
	public SetRatesDetails() {
		super();
	}
	
}