package com.integration.document;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;

	private String type;
	private String fullName;
	private String phone;
	private String email;
}
