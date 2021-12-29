package com.inditex.price.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.price.model.Prices;
import com.inditex.price.model.dto.PricesDto;
import com.inditex.price.repository.PricesRepository;

@Service
public class PricesService {

	@Autowired
	private PricesRepository pricesRepository;

	public PricesService(PricesRepository pricesRepository) {
		this.pricesRepository = pricesRepository;
	}
	
	public Optional<PricesDto> getPrice(LocalDateTime dateTime, Long prodId, Integer brandId) {
		List<Prices> prices = pricesRepository.findByProductIdAndBrandId(dateTime, prodId, brandId);
        return prices.stream()
                .map(p -> new PricesDto(p.getProductId(), p.getBrand().getBrandId(), p.getPrice(), p.getStartDate(), p.getEndDate()))
                .findFirst();
	}
	
	

}
