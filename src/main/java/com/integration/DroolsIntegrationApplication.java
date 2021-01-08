package com.integration;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieContainerSessionsPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DroolsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsIntegrationApplication.class, args);
	}
	
	@Bean
	public KieContainerSessionsPool poolConnection() {
		KieServices ks = KieServices.get();
		KieContainer kc = ks.getKieClasspathContainer();
		KieContainerSessionsPool pool = kc.newKieSessionsPool(2);
		return pool;
	}
}
