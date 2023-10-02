package com.Appointment.Dao;

import java.beans.BeanProperty;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Appointment.Model.Appointment;
import com.Appointment.Model.Doctor;

@Repository
public class AppointmentDaoImpl implements AppointmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(Appointment appointment) {
		boolean result1=false;
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		int i = (int) session.save(appointment);
		transaction.commit();
		if (i!=0) {
			result1=true;
			System.out.println("Product Added Successfully....!");
		}
		return result1;
	}
	public boolean add(Doctor doctor) {
//		boolean result2=false;
//		Session session=sessionFactory.openSession();
//		Transaction transaction=session.beginTransaction();
//		int i = (int) session.save(doctor);
//		transaction.commit();
//		if (i!=0) {
//			result2=true;
//			System.out.println("Product Added Successfully....!");
//		}
		return false;
	}
	public List<Appointment> list1() {
		
		return null;
	}
	
	public List<Doctor> list2() {
		
		return null;
	}
}
