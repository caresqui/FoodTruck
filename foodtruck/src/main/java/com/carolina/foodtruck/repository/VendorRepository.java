package com.carolina.foodtruck.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.carolina.foodtruck.entity.VendorEntity;

@Repository
public interface VendorRepository extends JpaRepository<VendorEntity, Long> {
	
	List<VendorEntity> findByApplicant(String applicant);
	
	Page<VendorEntity> findAll(Pageable pageable);
	
	@Query("SELECT v FROM VendorEntity v WHERE v.xcoord LIKE ?1% AND v.ycoord LIKE ?2%")
	List<VendorEntity> findNearVendor(String x, String y);

}
