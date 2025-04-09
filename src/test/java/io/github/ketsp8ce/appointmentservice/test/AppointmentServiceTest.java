package io.github.ketsp8ce.appointmentservice.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import io.github.ketps8ce.appointmentservice.main.AppointmentService;

import java.util.Date;

import java.util.ArrayList;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

class AppointmentServiceTest {
	
	Date testDate = new Date (128, 1, 1); //janruary 1st, 2028
	Date pastDate = new Date (0);
	
	//add an appointment service
	@Test
	public void testAddAppointment() {
		AppointmentService service = new AppointmentService();
		service.addAppointment("111111", testDate, "description");
		assertNotNull(service.getAppointment("111111"));
	}
	
	
	//delete an appointment service
	@Test
	public void testDeleteAppointment() {
        AppointmentService service = new AppointmentService();
		service.addAppointment("111111", testDate, "description");
        service.deleteAppointment("111111111");
        assertNull(service.getAppointment("111111111"));
	}
	
	

}
