package com.Appointment.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Doctor {
	@Id @Column 
	private long id;
	@Column
	private String name;
	@Column
	private String specielist;
	@Column
	private List<String> schedule;
	@Column
	private int maxPatients;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getSpecielist() {
		return specielist;
	}
	public void setSpecielist(String specielist) {
		this.specielist = specielist;
	}
	public List<String> getSchedule() {
		return schedule;
	}
	public void setSchedule(List<String> schedule) {
		this.schedule = schedule;
	}
	public int getMaxPatients() {
		return maxPatients;
	}
	public void setMaxPatients(int maxPatients) {
		this.maxPatients = maxPatients;
	}
	public void setName(String name) {
		this.name = name;
	}

}
