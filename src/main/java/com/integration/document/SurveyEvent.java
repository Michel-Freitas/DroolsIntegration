package com.integration.document;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class SurveyEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Header header;
	private Asset asset;
	
	@Field("case")
	@JsonProperty("case")
	private CaseForSurvey caseForSurvey;
	
	private Account account;
	private WorkOrder workOrder;
	
	private List<Addresse> addresses;
	private List<Contact> contacts;
	private List<ServiceEvent> serviceEvents;
	private List<Part> parts;
	private List<Waybill> waybills;
	private List<Instruction> instructions;
	
	@Override
	public String toString() {
		return "SurveyEvent [id=" + id + ", header=" + header + ", asset=" + asset + ", caseForSurvey=" + caseForSurvey
				+ ", account=" + account + ", workOrder=" + workOrder + ", addresses=" + addresses + ", contacts="
				+ contacts + ", serviceEvents=" + serviceEvents + ", parts=" + parts + ", waybills=" + waybills
				+ ", instructions=" + instructions + "]";
	}
}
