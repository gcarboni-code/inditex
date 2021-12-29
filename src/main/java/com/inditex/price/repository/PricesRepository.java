package com.inditex.price.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inditex.price.model.Prices;

public interface PricesRepository extends JpaRepository<Prices, Long>{

	@Query("select p from Prices p where ?1 between p.startDate and p.endDate"
			+ " and p.productId = ?2 and p.brand.brandId= ?3 order by p.priority desc")
    List<Prices> findByProductIdAndBrandId(LocalDateTime dateTime,
    		Long prodId, Integer brandId);

}
