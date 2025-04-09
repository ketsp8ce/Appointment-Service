package io.github.ketsp8ce.appointmentservice.test;
import io.github.ketps8ce.appointmentservice.main.Appointment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Date;


class AppointmentTest {

	Date testDate = new Date (128, 1, 1); //janruary 1st, 2028
	Date pastDate = new Date (0);
	
	//appointment ID constraint tests
	@Test
	@DisplayName ("appointment ID cannot have more than 10 characters")
	void testAppointmentIDWithMoreThanTenCharacters() {
	Appointment appointment = new Appointment ("111111", testDate, "description");
	if(appointment.getAppointmentID().length() > 10) {
	fail("contact id has more than 10 characters");
	}
	}
	
	@Test
	@DisplayName ("appointment ID cannot be null")
	void testAppointmentIDNotNull() {
	Appointment appointment = new Appointment (null, testDate, "description");
	if (appointment.getAppointmentID() == null) {
	fail ("Appointment ID is null");
	}
	}
	
	@Test
	@DisplayName ("appointment ID cannot be updatable")
	void testAppointmentIDUpdatable() {
		
	}
	
	
	//date constraint tests
	@Test
	@DisplayName ("date cannot be in the past")
	void testDateInPast() {
	
	}
	
	@Test
	@DisplayName ("date cannot be null")
	void testDateNotNull() {
		Appointment appointment = new Appointment ("111111", null, "description");
		if (appointment.getDate() == null) {
			fail("date is null");
		}
	}
	
	
	//description constraint tests
	@Test
	@DisplayName ("description cannot have more than 50 characters")
	void testDescriptionWithMoreThanFiftyCharacters() {
		Appointment appointment = new Appointment ("111111", testDate, "jdkfhakljdshfkljashdkfjhasdlfhaldjshfahkjfaksdlfjhakldjfhakdjsfhkajdshfkjashdfkjhasdklfhaldjshladhjsfkljah");
		if (appointment.getDescription().length() > 50) {
			fail("description has more than 50 characters");	
	}
	}
	
	@Test
	@DisplayName ("description cannot be null")
	void testDescriptionNotNull() {
		Appointment appointment = new Appointment ("111111", testDate, null);
		if (appointment.getDescription() == null) {
			fail("description is null");
		}
	}

}
