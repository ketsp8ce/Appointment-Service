package io.github.ketps8ce.appointmentservice.main;
import java.util.ArrayList;
import java.util.Date;


public class AppointmentService {
	
	//create an ArrayList of Appointment objects
	ArrayList <Appointment> appointmentList = new ArrayList <Appointment>();
	
	//Display the full list of appointments to the console for error checking.
		public void displayAppointmentList() {
		for(int counter = 0; counter < appointmentList.size(); counter++) {
		System.out.println("\t Appointment ID: " + appointmentList.get(counter).getAppointmentID());
		System.out.println("\t Date: " + appointmentList.get(counter).getDate());
		System.out.println("\t Description: " + appointmentList.get(counter).getDescription());
		}
		}
		
		//Adds a new appointment using the Appointment constructor, then assign the new appointment to the list.
		public void addAppointment(String appointmentID, Date date, String description) {
		//Create the new appointment
			Appointment appointment = new Appointment(appointmentID, date, description);
			appointmentList.add(appointment);
			}

		//Deletes an appointment
		public void deleteAppointment(String appointmentID) {
			
			for (int i = 0; i < appointmentList.size(); i++) {  //iterates through appointment array list and checks the address
			if (appointmentList.get(i).getAppointmentID().equals(appointmentID)) { //if a given element in the appointment array list matches the value at the address for appointment id, delete it  
				appointmentList.remove(i);
				return;
			}
			}
		}
		
	

}
