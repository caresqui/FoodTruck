package com.carolina.foodtruck.to;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vendor {

	private long locationId;
	private String applicant;
}
