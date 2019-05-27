package ar.commerce.mercadoboom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.commerce.mercadoboom.dao.BrandRepository;
import ar.commerce.mercadoboom.dto.Brand;

@Service
public class BrandService {
	
	@Autowired
	BrandRepository dao;
	
	public Brand save (Brand brand){
		return dao.saveAndFlush(brand);
	}
	
	public Brand getById(Long id){
		
		return dao.getOne(id);
	
	}
}
