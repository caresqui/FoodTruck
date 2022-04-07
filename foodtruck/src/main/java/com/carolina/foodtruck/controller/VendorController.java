package com.carolina.foodtruck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carolina.foodtruck.entity.VendorEntity;
import com.carolina.foodtruck.services.IVendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	private IVendorService vendorService;

	@GetMapping
	public ResponseEntity<List<VendorEntity>> findByApplicant(@RequestParam(required = false) String applicant) {

		List<VendorEntity> results = vendorService.findByApplicant(applicant);
		if (!CollectionUtils.isEmpty(results)) {
			return new ResponseEntity<>(results, HttpStatus.OK);
		}
		return new ResponseEntity<>(results, HttpStatus.NO_CONTENT);
	}

	@GetMapping("/page")
	public ResponseEntity<Page<VendorEntity>> findAll(@RequestParam(required = true) Integer pageNumber,
			@RequestParam(required = true) Integer pageElements) {
		Page<VendorEntity> results = vendorService.findAll(pageNumber, pageElements);
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
	
	@GetMapping("/near")
	public ResponseEntity<List<VendorEntity>> findNearVendor(@RequestParam(required = true) String x,
			@RequestParam(required = true) String y) {

		List<VendorEntity> results = vendorService.findNearVendors(x, y);
		if (!CollectionUtils.isEmpty(results)) {
			return new ResponseEntity<>(results, HttpStatus.OK);
		}
		return new ResponseEntity<>(results, HttpStatus.NO_CONTENT);
	}

}
