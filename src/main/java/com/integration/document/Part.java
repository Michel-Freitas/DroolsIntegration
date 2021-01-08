package com.integration.document;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Part implements Serializable {

	private static final long serialVersionUID = 1L;

	private String partNumber;
	private Long quantity;
	private String description;
	private String functionalDescription;
	private boolean replacementAllowed;
	private Double unitPrice;
	private String dispatchMode;
	
	private List<DeliveryDetail> deliveryDetails;
}
