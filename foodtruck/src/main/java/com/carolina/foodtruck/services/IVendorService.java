package com.carolina.foodtruck.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.carolina.foodtruck.entity.VendorEntity;

public interface IVendorService {
	public List<VendorEntity> findByApplicant(String applicant);
	public Page<VendorEntity> findAll(Integer pageNumber, Integer pageSize);
	public List<VendorEntity> findNearVendors(String xCoord,String yCoord);
	
}
