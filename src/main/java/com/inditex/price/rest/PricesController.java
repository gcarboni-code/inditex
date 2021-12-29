package com.inditex.price.rest;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.price.model.dto.PricesDto;
import com.inditex.price.service.PricesService;

@RestController
@RequestMapping("/prices")
public class PricesController {
	
	@Autowired
	private PricesService pricesService;
	
	@GetMapping(path = "/getPrice")
	public Optional<PricesDto> getPrice(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'-'HH.mm") LocalDateTime fecha, 
			@RequestParam("prod") Long prodId, @RequestParam("brand") Integer brandId) {
		return pricesService.getPrice(fecha, prodId, brandId);
	}
	
}
