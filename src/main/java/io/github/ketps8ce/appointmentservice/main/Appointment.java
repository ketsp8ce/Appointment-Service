package io.github.ketps8ce.appointmentservice.main;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;


public class Appointment {
	
	//variables and objects
	private final String appointmentID;
	private String date;
	private String description;
	private static AtomicLong idGenerator = new AtomicLong();

	//CONSTRUCTOR

	public Appointment(String appointmentID, String name, String date, String description) {
		
		//APPOINTMENTID
		this.appointmentID = String.valueOf(idGenerator.getAndIncrement());
		
		//DATE
		//??????????????????????????????????
		if (date == null || date.isBlank()) {
			this.date = "NULL";
		} else if (//in the past)
			//output an error
			else {
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
	
	public String getDate() {
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	
	//SETTERS
	
	//set date
	
	
	public void setDescription(String appointmentID, String description) {
		this.description = description;
		description.substring(0, Math.min(description.length(), 50));
	}
	
	
}
