package ar.commerce.mercadoboom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.commerce.mercadoboom.dao.BrandRepository;
import ar.commerce.mercadoboom.dto.Brand;
import ar.commerce.mercadoboom.exception.ResourceNotFoundException;

@Service
public class BrandService {
	
	@Autowired
	BrandRepository dao;
	
	public Brand save (Brand brand){
		return dao.saveAndFlush(brand);
	}
	
	public Brand getById(Long id){
		
		return dao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Brand", "id", id));
	
	}
	
	public List<Brand> getAll(){
		
		return dao.findAll();
	}
}
