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
@RequestMapping("/api/SalesReturnDetails")
public class SaleReturnDetailsController implements Serializable{

	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    
    @Autowired
    private SaleReturnDetailsRepository saleReturnDetailsRepository;
    
    
    @GetMapping("/all")
	public ResponseEntity<Object> getAllSaleReturnDetails(){
		
		try {
			Iterable<SaleReturnDetails> SaleReturnDetails = saleReturnDetailsRepository.findAll();
			return new ResponseEntity<Object>(SaleReturnDetails, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    
    @GetMapping("/by/{id}")
	public ResponseEntity<Object> getSaleReturnDetailsById(@PathVariable("id") Long id) {
		try {
			SaleReturnDetails saleReturnDetails = saleReturnDetailsRepository.findById(id).get();
			if(saleReturnDetails != null) {
				return new ResponseEntity<Object>(saleReturnDetails, HttpStatus.OK);				
			} else {
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
			}
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PostMapping("/create")
	public ResponseEntity<Object> createSaleReturnDetails(@RequestBody SaleReturnDetails saleReturnDetails) {
		try {   
			SaleReturnDetails savedSaleReturnDetails = saleReturnDetailsRepository.save(saleReturnDetails);
			return new ResponseEntity<Object>(savedSaleReturnDetails, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Object> updateSaleReturnDetails(@PathVariable("id") Long id, @RequestBody SaleReturnDetails saleReturnDetails) {
		try {
			saleReturnDetails.setId(id);
			SaleReturnDetails savedSaleReturnDetails = saleReturnDetailsRepository.save(saleReturnDetails);
			return new ResponseEntity<Object>(savedSaleReturnDetails , HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteSaleReturnDetails(@PathVariable("id") Long id) {
		try {
			saleReturnDetailsRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
