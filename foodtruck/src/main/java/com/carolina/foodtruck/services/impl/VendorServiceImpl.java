package com.carolina.foodtruck.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.carolina.foodtruck.entity.VendorEntity;
import com.carolina.foodtruck.repository.VendorRepository;
import com.carolina.foodtruck.services.IVendorService;

@Service
public class VendorServiceImpl implements IVendorService {

	@Autowired
	private VendorRepository vendorRepository;

	@SuppressWarnings("unchecked")
	public List<VendorEntity> findByApplicant(String applicant) {
		List<VendorEntity> result = vendorRepository.findByApplicant(applicant);
		if(result == null) {
			return Collections.EMPTY_LIST;
		}
		return result;
	}
	
	public Page<VendorEntity> findAll(Integer pageNumber, Integer pageSize){
		Pageable pageWithElements = PageRequest.of(pageNumber, pageSize);
		Page<VendorEntity> result = vendorRepository.findAll(pageWithElements);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public List<VendorEntity> findNearVendors(String xCoord,String yCoord) {
		List<VendorEntity> result = vendorRepository.findNearVendor(xCoord,yCoord);
		if(result == null) {
			return Collections.EMPTY_LIST;
		}
		return result;
	}
}
