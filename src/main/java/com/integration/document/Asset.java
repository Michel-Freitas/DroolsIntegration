package com.integration.document;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Asset implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String serialNumber;
	private String serviceTag;
	private String expressServiceCode;
	private Boolean isHESWorkOrder;
	private String productName;
	private String productDescription;
	private String lob;
	private String orderNumber;
	private String orderBUID;
	
	
	
}
