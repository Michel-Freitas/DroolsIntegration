package com.integration.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.integration.document.SurveyEvent;

public interface DroolsIntegrationRepository extends ReactiveMongoRepository<SurveyEvent, String>{

}
