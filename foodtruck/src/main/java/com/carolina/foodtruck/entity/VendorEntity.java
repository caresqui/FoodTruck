package com.carolina.foodtruck.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "VENDOR")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class VendorEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "LOCATIONID")
	private long locationId;

	@Column(name = "APPLICANT")
	private String applicant;
	
	@Column(name = "X")
	private String xcoord;
	
	@Column(name = "Y")
	private String ycoord;

}
