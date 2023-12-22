package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout)  {
		if(!checkout.after(checkin)) {
			throw new DomainException( "Error in reservation: check-out date must be after check-in date");
		}	

		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkin, Date checkout)  {
		Date now = new Date();
		if(checkin.before(now) || checkout.before(now) ) {
			
			throw new DomainException( "Error in reservation: Reservation dates for update must be future");
		}
		
				
		
		this.checkin = checkin;
		this.checkout = checkout;
		
	}
	
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", Check-in: "
				+ sdf.format(checkin)
				+ " , Check-out; "
				+ sdf.format(checkout)
				+ " , "
				+ duration()
				+ " nights";
	}

}
