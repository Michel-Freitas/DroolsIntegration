package com.integration.service;

import org.kie.api.runtime.KieContainerSessionsPool;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integration.document.SurveyEvent;

import reactor.core.publisher.Mono;

@Service
public class IntegrationService {
	
	@Autowired
	private KieContainerSessionsPool poolConnection;
	
	@Autowired
	private DroolsService srvDrools;
	
	public void ruleSaveSurveyEvent(SurveyEvent event) {
		KieSession session = poolConnection.newKieSession("saveEvent");
		session.setGlobal("srDrools", srvDrools);
		FactHandle handlea = session.insert(event);
		SurveyEvent eventModel = (SurveyEvent) session.getObject(handlea);
		System.out.println("Status da WorkOrder: " + eventModel.getCaseForSurvey().getStatus());
		session.fireAllRules();
	}

}
