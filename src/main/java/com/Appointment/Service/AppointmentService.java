package com.Appointment.Service;

import java.util.List;

import com.Appointment.Model.Appointment;
import com.Appointment.Model.Doctor;

public interface AppointmentService {
	public boolean add(Appointment appointment);
	public boolean add(Doctor doctor);
	public List<Appointment> list1();
	public List<Doctor> list2();
}
