package com.hcl.supplymanagementsystem.entity;

import java.io.Serializable;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity

public class Demand implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long demandId;

	public Long getDemandId() {
		return demandId;
	}

	public void setDemandId(Long demandId) {
		this.demandId = demandId;
	}

	public Long getProjectManagerId() {
		return projectManagerId;
	}

	public void setProjectManagerId(Long projectManagerId) {
		this.projectManagerId = projectManagerId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	private Long projectManagerId;
	private String location;
	private String experience;

	@ManyToOne
	@JoinColumn(name = "rolesId")
	Roles roles;

}
