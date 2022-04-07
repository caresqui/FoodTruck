package com.carolina.foodtruck.controller;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.carolina.foodtruck.entity.VendorEntity;
import com.carolina.foodtruck.services.IVendorService;

@SpringBootTest
class VendorControllerTest {

	@Autowired
	private VendorController vendorController;

	@Mock
	private IVendorService vendorService;

	@Test
	void findByApplicant() throws Exception{
		
		ResponseEntity<List<VendorEntity>>results = vendorController.findByApplicant("The Geez Freeze");
		
		Assertions.assertNotNull(results);
		Assertions.assertEquals(1,results.getBody().size());
	}

	@Test
	void findByApplicant_NotFound() throws Exception {
		ResponseEntity<List<VendorEntity>> results = vendorController.findByApplicant("");

		Assertions.assertNotNull(results);
		Assertions.assertEquals(HttpStatus.NO_CONTENT, results.getStatusCode());
		Assertions.assertEquals(0, results.getBody().size());

	}
}
