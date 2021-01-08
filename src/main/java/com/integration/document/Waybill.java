package com.integration.document;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Waybill implements Serializable {

	private static final long serialVersionUID = 1L;

	private String wayBillNumber;
	private String carrierName;
	private String type;
	
}
