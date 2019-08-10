package com.hcl.supplymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.supplymanagementsystem.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
	
	public Skill findBySkillName(String skillName);

}
