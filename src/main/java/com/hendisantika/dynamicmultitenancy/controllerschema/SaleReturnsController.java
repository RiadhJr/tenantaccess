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
@RequestMapping("/api/SalesReturns")
public class SaleReturnsController implements Serializable{

	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    
    @Autowired
    private SaleReturnsRepository saleReturnsRepository;
    
    
    @GetMapping("/all")
	public ResponseEntity<Object> getAllSaleReturns(){
		
		try {
			Iterable<SaleReturns> SaleReturns = saleReturnsRepository.findAll();
			return new ResponseEntity<Object>(SaleReturns, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    
    @GetMapping("/by/{id}")
	public ResponseEntity<Object> getSaleReturnsById(@PathVariable("id") Long id) {
		try {
			SaleReturns saleReturns = saleReturnsRepository.findById(id).get();
			if(saleReturns != null) {
				return new ResponseEntity<Object>(saleReturns, HttpStatus.OK);				
			} else {
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
			}
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PostMapping("/create")
	public ResponseEntity<Object> createSaleReturns(@RequestBody SaleReturns saleReturns) {
		try {   
			SaleReturns savedSaleReturns = saleReturnsRepository.save(saleReturns);
			return new ResponseEntity<Object>(savedSaleReturns, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Object> updateSaleReturns(@PathVariable("id") Long id, @RequestBody SaleReturns saleReturns) {
		try {
			saleReturns.setId(id);
			SaleReturns savedSaleReturns = saleReturnsRepository.save(saleReturns);
			return new ResponseEntity<Object>(savedSaleReturns , HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteSaleReturns(@PathVariable("id") Long id) {
		try {
			saleReturnsRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
