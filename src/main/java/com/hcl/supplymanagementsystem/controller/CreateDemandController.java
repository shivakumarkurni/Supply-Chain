package com.hcl.supplymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.supplymanagementsystem.service.CreateDemandService;


@RestController
public class CreateDemandController {

	@Autowired
	CreateDemandService createDemandService;
	
	@PostMapping("/demand/create/managerId/{managerId}/skillId/{skillId}")
	public ResponseEntity<String> demandCreation(@PathVariable Long managerId, @PathVariable Integer skillId){
		
		return new ResponseEntity<String>(createDemandService.demandCreation(managerId,skillId),HttpStatus.CREATED);
		
	}

}
