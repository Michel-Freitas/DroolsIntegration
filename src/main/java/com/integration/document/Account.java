package com.integration.document;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private String number;
	private String name;
	private String linkNumber;
	private String ccn;
	private String alternateAccount;
	
}
