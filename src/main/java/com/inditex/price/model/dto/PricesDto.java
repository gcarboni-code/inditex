package com.inditex.price.model.dto;

import java.time.LocalDateTime;

public class PricesDto {

	private Long productId;

	private Integer brandId;
	
	private Double price;

	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	public PricesDto(Long productId, Integer brandId, Double price, LocalDateTime startDate,
			LocalDateTime endDate) {
		this.productId = productId;
		this.brandId = brandId;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object other) {
	   return getProductId().equals(((PricesDto) other).getProductId())
			   && getBrandId().equals(((PricesDto) other).getBrandId())
			   && getPrice().equals(((PricesDto) other).getPrice())
			   && getStartDate().equals(((PricesDto) other).getStartDate())
			   && getEndDate().equals(((PricesDto) other).getEndDate());
			   
	}
}
