package ar.commerce.mercadoboom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.commerce.mercadoboom.dto.Brand;

public interface BrandRepository  extends JpaRepository<Brand, Long>{
	
}
