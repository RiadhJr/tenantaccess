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
@RequestMapping("/api/PurchaseReturns")
public class PurchaseReturnsController implements Serializable{

	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    
    @Autowired
    private PurchaseReturnsRepository PurchaseReturnsRepository;
    
    
    @GetMapping("/all")
	public ResponseEntity<Object> getAllPurchaseReturns(){
		
		try {
			Iterable<PurchaseReturns> PurchaseReturns = PurchaseReturnsRepository.findAll();
			return new ResponseEntity<Object>(PurchaseReturns, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    
    @GetMapping("/by/{id}")
	public ResponseEntity<Object> getPurchaseReturnsById(@PathVariable("id") Long id) {
		try {
			PurchaseReturns contact = PurchaseReturnsRepository.findById(id).get();
			if(contact != null) {
				return new ResponseEntity<Object>(contact, HttpStatus.OK);				
			} else {
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
			}
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PostMapping("/create")
	public ResponseEntity<Object> createPurchaseReturns(@RequestBody PurchaseReturns PurchaseReturns) {
		try {   
			PurchaseReturns savedPurchaseReturns = PurchaseReturnsRepository.save(PurchaseReturns);
			return new ResponseEntity<Object>(savedPurchaseReturns, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Object> updateAdjustmentDetails(@PathVariable("id") Long id, @RequestBody PurchaseReturns PurchaseReturns) {
		try {
			PurchaseReturns.setId(id);
			PurchaseReturns savedPurchaseReturns = PurchaseReturnsRepository.save(PurchaseReturns);
			return new ResponseEntity<Object>(savedPurchaseReturns , HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deletePurchaseReturns(@PathVariable("id") Long id) {
		try {
			PurchaseReturnsRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
