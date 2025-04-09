// Author: Hunter Marx
// Date: 04/08/2025
// Course ID: 
// Description: This is the Appointment class. It creates and stores Appointments.
// See the Constructor for more info.


package io.github.ketps8ce.appointmentservice.main;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;

import io.github.ketps8ce.appointmentservice.main.Appointment;
public class Appointment {
	
	//variables and objects
	private final String appointmentID;
	private Date date;
	private String description;
	private static AtomicLong idGenerator = new AtomicLong();

	//CONSTRUCTOR

	public Appointment(String appointmentID, Date date, String description) {
		
		//APPOINTMENTID
		this.appointmentID = String.valueOf(idGenerator.getAndIncrement());
		
		//DATE
		if (date == null) {
			this.date = new Date();
		}
		else if (date.before(new Date())) { //if date is before the present date
			this.date = new Date(); //change the date to the present date 
		} else {
			this.date = date;
		}
			
		
		//DESCRIPTION
		if (description == null || description.isBlank()) {
		this.description = "NULL";
		} else if(description.length() > 50 ) {
			this.description = description.substring(0, 50);
		} else {
			this.description = description;
		}
		
	}

	//GETTERS
	public String getAppointmentID() {
		return appointmentID;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	
	//SETTERS
	
	//set date
	public void setDate(Date date) {
	if (date == null) {
		this.date = new Date();
	}
	else if (date.before(new Date())) { //if date is before the present date
		this.date = new Date(); //change the date to the present date 
	} else {
		this.date = date;
	}
}
	
	
	public void setDescription(String appointmentID, String description) {
		this.description = (description == null || description.isBlank()) ? "NULL" :
		description.substring(0, Math.min(description.length(), 50));
	}
	
	
}
