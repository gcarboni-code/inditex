package com.inditex.price.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {

	@Id
	@Column(name = "BRAND_ID")
	private Integer brandId;

	@Column(name = "BRAND_DESCR")
	private String brandDescr;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandDescr() {
		return brandDescr;
	}

	public void setBrandDescr(String brandDescr) {
		this.brandDescr = brandDescr;
	}
	
}
