package com.hcl.supplymanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.supplymanagementsystem.dto.DemandDto;
import com.hcl.supplymanagementsystem.dto.SkillsDto;
import com.hcl.supplymanagementsystem.entity.Demand;
import com.hcl.supplymanagementsystem.entity.DemandSkills;
import com.hcl.supplymanagementsystem.entity.Skill;
import com.hcl.supplymanagementsystem.repository.CreateDemandRepository;
import com.hcl.supplymanagementsystem.repository.DemandSkillsRepository;
import com.hcl.supplymanagementsystem.repository.SkillRepository;

@Service
public class CreateDemandService {

	@Autowired
	CreateDemandRepository createDemandRepository;

	@Autowired
	DemandSkillsRepository demandSkillsRepository;

	@Autowired
	SkillRepository skillRepository;

	public String demandCreation(Long managerId, Integer skillId) {

		Demand demand = new Demand();

		demand.setProjectManagerId(managerId);


		Demand demands = createDemandRepository.save(demand);

		
			Skill skill = skillRepository.findById(skillId).get();
			DemandSkills demandSkills = new DemandSkills();
			
			
			demand.setDemandId(demands.getDemandId());
			demandSkills.setDemand(demand);
			demandSkills.setSkill(skill);

			demandSkillsRepository.save(demandSkills);

		

		return "Demand Created successfully";

	}

}
