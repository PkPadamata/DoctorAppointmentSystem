package com.Appointment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Appointment.Model.Appointment;
import com.Appointment.Model.Doctor;
import com.Appointment.Service.AppointmentService;
import com.Appointment.utils.Response;

@RestController
public class DoctorController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	// @PostMapping("/addDetails")
	@RequestMapping("api/doctors")
	public ResponseEntity<Object> add(@RequestBody Appointment appointment){
		boolean result1 =appointmentService.add(appointment);
	//	boolean result2 = appointmentService.add(doctor);
		if(result1==true) {
			Response response =new Response();
			response.setMessage("Product Added SuccessFully");
			response.setOperationStatus("Successfull...!");
			return new ResponseEntity<Object> (response,HttpStatus.OK);
		}
		else {
			Response response =new Response();
			response.setMessage("Product Add Failed..!");
			response.setOperationStatus("Failed...!");
			return new ResponseEntity<Object> (response,HttpStatus.BAD_REQUEST);
		}
		
	}
	@RequestMapping("api/Appointments")
	public ResponseEntity<Object> add(@RequestBody Doctor doctor){
		boolean result2 = appointmentService.add(doctor);
		if(result2==true) {
			Response response =new Response();
			response.setMessage("Product Added SuccessFully");
			response.setOperationStatus("Successfull...!");
			return new ResponseEntity<Object> (response,HttpStatus.OK);
		}
		else {
			Response response =new Response();
			response.setMessage("Product Add Failed..!");
			response.setOperationStatus("Failed...!");
			return new ResponseEntity<Object> (response,HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
