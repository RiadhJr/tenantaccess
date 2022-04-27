package com.hendisantika.dynamicmultitenancy.controllerschema;
import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hendisantika.dynamicmultitenancy.controller.AuthenticationController;

import com.hendisantika.dynamicmultitenancy.tenant.entity.*;
import com.hendisantika.dynamicmultitenancy.tenant.repository.*;



@RestController
@RequestMapping("/api/Brands")
public class BrandsController implements Serializable{

	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    
    @Autowired
    private BrandsRepository brandsRepository;
    
    
    @GetMapping("/all")
	public ResponseEntity<Object> getAllAdjustments(){
		
		try {
			Iterable<Brands> Brands = brandsRepository.findAll();
			return new ResponseEntity<Object>(Brands, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    
    @GetMapping("/by/{id}")
	public ResponseEntity<Object> getAdjustmentsById(@PathVariable("id") Long id) {
		try {
			Brands brands = brandsRepository.findById(id).get();
			if(brands != null) {
				return new ResponseEntity<Object>(brands, HttpStatus.OK);				
			} else {
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
			}
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PostMapping("/create")
	public ResponseEntity<Object> createBrands(@RequestBody Brands brands) {
		try {   
			Brands savedBrands = brandsRepository.save(brands);
			return new ResponseEntity<Object>(savedBrands, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Object> updateBrands(@PathVariable("id") Long id, @RequestBody Brands brands) {
		try {
			brands.setId(id);
			Brands savedBrands = brandsRepository.save(brands);
			return new ResponseEntity<Object>(savedBrands , HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteBrands(@PathVariable("id") Long id) {
		try {
			brandsRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
