package com.integration.document;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Header implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String generatedDateTime;
	private String source;
	private List<String> events;
	
}
