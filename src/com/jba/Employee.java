package com.jba;

import java.time.LocalDate;
import java.util.List;

public class Employee {
	
	
	private int id;
	private String designation;
	private String name;
	private LocalDate dateOfJoining;
	private List<String> mobileNos;
	
	
	
	
	public Employee(int id, String designation, String name, LocalDate dateOfJoining, List<String> mobileNos) {
		super();
		this.id = id;
		this.designation = designation;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.mobileNos = mobileNos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public List<String> getMobileNos() {
		return mobileNos;
	}
	public void setMobileNos(List<String> mobileNos) {
		this.mobileNos = mobileNos;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", designation=" + designation + ", name=" + name + ", dateOfJoining="
				+ dateOfJoining + ", mobileNos=" + mobileNos + "]";
	}
	
	
	

}
