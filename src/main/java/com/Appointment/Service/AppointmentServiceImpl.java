package com.Appointment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Appointment.Dao.AppointmentDao;
import com.Appointment.Model.Appointment;
import com.Appointment.Model.Doctor;

import jakarta.transaction.Transactional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppointmentDao appointmentDao;
	
	@Transactional
	public boolean add(Appointment appointment) {
		
		return appointmentDao.add(appointment);
	}

	@Override
	public boolean add(Doctor doctor) {
		
		return appointmentDao.add(doctor);
	}

	@Override
	public List<Appointment> list1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> list2() {
		// TODO Auto-generated method stub
		return null;
	}

}
