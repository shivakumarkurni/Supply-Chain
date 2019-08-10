package com.hcl.supplymanagementsystem.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class DemandSkills implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long demandSkillsId;

	public Long getDemandSkillsId() {
		return demandSkillsId;
	}

	public void setDemandSkillsId(Long demandSkillsId) {
		this.demandSkillsId = demandSkillsId;
	}

	public Demand getDemand() {
		return demand;
	}

	public void setDemand(Demand demand) {
		this.demand = demand;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@ManyToOne
	@JoinColumn(name = "demand_id")
	private Demand demand;

	@ManyToOne
	@JoinColumn(name = "skill_id")
	private Skill skill;

}
