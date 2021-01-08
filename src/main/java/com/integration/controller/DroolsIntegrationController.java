package com.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.integration.document.SurveyEvent;
import com.integration.service.IntegrationService;

@RestController
@RequestMapping(value = "/api/integration")
public class DroolsIntegrationController {
	
	@Autowired
	private IntegrationService srvIntegration;
	
	@PostMapping
	public void rulesaveEvent(@RequestBody SurveyEvent event) {
		srvIntegration.ruleSaveSurveyEvent(event);
	}

}
