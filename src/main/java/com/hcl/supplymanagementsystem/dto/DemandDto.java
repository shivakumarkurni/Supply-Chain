package com.hcl.supplymanagementsystem.dto;

import java.util.List;

public class DemandDto {

	private Long demandId;

	private Long ProjectManagerId;
	private List<SkillsDto> skills;

	public Long getDemandId() {
		return demandId;
	}

	public void setDemandId(Long demandId) {
		this.demandId = demandId;
	}

	public Long getProjectManagerId() {
		return ProjectManagerId;
	}

	public void setProjectManagerId(Long projectManagerId) {
		ProjectManagerId = projectManagerId;
	}

	public List<SkillsDto> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillsDto> skills) {
		this.skills = skills;
	}



}
