package ar.commerce.mercadoboom.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.commerce.mercadoboom.dto.Brand;
import ar.commerce.mercadoboom.service.BrandService;

@RestController
public class BrandsApi {
	@Autowired
	BrandService service;
	@RequestMapping(value="/brand/get", method=RequestMethod.POST)
	public Brand getById(Integer id){
		return service.getById(new Long(id));
	}
	
	@RequestMapping(value="/brand/updateOrSave", method=RequestMethod.POST)
	public Brand updateOrSave(@RequestBody Brand brand){
		return service.save(brand); 
	}
}
