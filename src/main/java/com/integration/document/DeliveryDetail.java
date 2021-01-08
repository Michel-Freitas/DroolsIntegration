package com.integration.document;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeliveryDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private String partNumber;
	private Long quantity;
	private String description;
	private String status;
	private String podSignatory;
	
	private List<StatusDate> statusDates;
}
