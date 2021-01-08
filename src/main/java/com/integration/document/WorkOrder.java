package com.integration.document;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkOrder implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String owner;
	private String repeatCount;
	private String laborStatus;
	private String partStatus;
	private String region;
	private String buid;
	private String serviceHours;
	private String serviceLevel;
	private String serviceType;
	private String workOrderType;
	private String sourceSystemCreationDate;
	private String lastUpdateDate;
	private String status;
	private String subRegion;
	private String workOrderNumber;
	private String dispatchNumber;
	private String entitlementStartDate;
	private String entitlementEndDate;
	private String timeZone;
	
	private List<Attribute> attributes;
	private List<Partner> partners;
	private List<NotificationPreference> notificationPreferences;
	
}
