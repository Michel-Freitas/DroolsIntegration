package com.integration.document;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data()
public class CaseForSurvey implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Field("id")
	private String idForSurvey;
	private String caseNumber;
	private String deltaCaseNumber;
	private String subject;
	private String status;
	private String priority;
		
}
