package com.integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integration.document.SurveyEvent;
import com.integration.repository.DroolsIntegrationRepository;

import reactor.core.publisher.Mono;

@Service
public class DroolsService {
	
	@Autowired
	private DroolsIntegrationRepository rpsDroolsIntegration;
	
	public Mono<SurveyEvent> saveSurveyEvent(SurveyEvent event){
		Mono<SurveyEvent> EventModel = rpsDroolsIntegration.save(event);
		EventModel.subscribe(e -> System.out.println(e.getId()));
//		Quando uso o block, apresenta um erro informando que está bloquenaod a execução da regra do Drools
//		EventModel.block();
		return EventModel;
	}

}
