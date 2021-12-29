package com.inditex.price;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.inditex.price.model.dto.PricesDto;
import com.inditex.price.service.PricesService;


@SpringBootTest
@ActiveProfiles("test")
public class PriceApplicationTests {

	@Autowired
	PricesService pricesService;

	@Test
	@DisplayName("Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)")
	public void test1() {
		Optional<PricesDto> p = pricesService.getPrice(LocalDateTime.of(2020, 6, 14, 10, 0), 35455L, 1);
		PricesDto esperado = new PricesDto(35455L, 1, 35.5, LocalDateTime.of(2020, 6, 14, 0, 0, 0), LocalDateTime.of(2020, 12, 31, 23, 59, 59));
		assertEquals(p.get(), esperado);
	}

	@Test
	@DisplayName("Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)")
	public void test2() {
		Optional<PricesDto> p = pricesService.getPrice(LocalDateTime.of(2020, 6, 14, 16, 0), 35455L, 1);
		PricesDto esperado = new PricesDto(35455L, 1, 25.45, LocalDateTime.of(2020, 6, 14, 15, 0, 0), LocalDateTime.of(2020, 6, 14, 18, 30, 0));
		assertEquals(p.get(), esperado);
	}
	
	@Test
	@DisplayName("Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)")
	public void test3() {
		Optional<PricesDto> p = pricesService.getPrice(LocalDateTime.of(2020, 6, 14, 21, 0), 35455L, 1);
		PricesDto esperado = new PricesDto(35455L, 1, 35.5, LocalDateTime.of(2020, 6, 14, 0, 0, 0), LocalDateTime.of(2020, 12, 31, 23, 59, 59));
		assertEquals(p.get(), esperado);
	}
	
	@Test
	@DisplayName("Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)")
	public void test4() {
		Optional<PricesDto> p = pricesService.getPrice(LocalDateTime.of(2020, 6, 15, 10, 0), 35455L, 1);
		PricesDto esperado = new PricesDto(35455L, 1, 30.50, LocalDateTime.of(2020, 6, 15, 0, 0, 0), LocalDateTime.of(2020, 6, 15, 11, 0, 0));
		assertEquals(p.get(), esperado);
	}
	
	@Test
	@DisplayName("Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)")
	public void test5() {
		Optional<PricesDto> p = pricesService.getPrice(LocalDateTime.of(2020, 6, 16, 21, 0), 35455L, 1);
		PricesDto esperado = new PricesDto(35455L, 1, 38.95, LocalDateTime.of(2020, 6, 15, 16, 0, 0), LocalDateTime.of(2020, 12, 31, 23, 59, 59));
		assertEquals(p.get(), esperado);
	}

}
