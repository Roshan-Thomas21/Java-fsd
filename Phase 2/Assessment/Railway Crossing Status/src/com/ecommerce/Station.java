package com.ecommerce;

import javax.persistence.*;

@Entity
@Table(name = "station")
public class Station {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;

	@Column(name = "sname")
	private String sname;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "person_incharge")
	private String person_incharge;
	
	@Column(name = "schedule")
	private String schedule;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "address")
	private String address;

	public Station() {

	}

	public Station(int id,String sname,String status,String person_incharge,String schedule,String landmark,String address) {
		this.ID=id;
		this.sname = sname;
		this.status = status;
		this.person_incharge = person_incharge;
		this.schedule = schedule;
		this.landmark = landmark;
		this.address = address;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getPerson_incharge() {
		return person_incharge;
	}

	public void setPerson_incharge(String person_incharge) {
		this.person_incharge = person_incharge;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}