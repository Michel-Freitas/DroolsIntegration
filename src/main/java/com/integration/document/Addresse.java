package com.integration.document;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Addresse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String addressType;
	private String locationType;
	private String addressLine1;
	private String countryCode;
	private String state;
	private String city;
	private String postalCode;
	
}
