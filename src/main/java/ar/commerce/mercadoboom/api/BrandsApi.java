package ar.commerce.mercadoboom.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.commerce.mercadoboom.dto.Brand;
import ar.commerce.mercadoboom.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandsApi {
	@Autowired
	BrandService service;
	
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		return service.getAll();
	}
	
	@PostMapping(path={"/getById/{id}"})
	public Brand getById(@PathVariable Integer id){
//		Optional<Brand> brand = ; 
		return service.getById(new Long(id));
	}
	
	@RequestMapping(value="/updateOrSave", method=RequestMethod.POST)
	public Brand updateOrSave(@RequestBody Brand brand){
		return service.save(brand); 
	}
	
	@RequestMapping(value="/getOne", method=RequestMethod.GET)
	public Brand getOne(){
        return new Brand(1L, "AS", 321);
	}
}
