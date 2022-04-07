package com.carolina.foodtruck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carolina.foodtruck.controller.VendorController;

@SpringBootTest
class FoodtruckApplicationTests {

	@Autowired
	private VendorController vendorController;
	
	@Test
	public void contextLoads() throws Exception {
		Assertions.assertNotNull(vendorController);
	}

}
