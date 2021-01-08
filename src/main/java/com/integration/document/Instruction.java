package com.integration.document;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Instruction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Field("id")
	private String idForInstruction;
	private Boolean isSpecialInstruction;
	private String createdDate;
	private String audience;
	private String description;
	private String createdBy;
}
