package com.integration.document;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String vendorDate;
	private String sourceSystemCreationDate;
	private String lastUpdateDate;
}
