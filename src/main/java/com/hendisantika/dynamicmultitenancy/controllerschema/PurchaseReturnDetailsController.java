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
@RequestMapping("/api/PurchaseReturnDetails")
public class PurchaseReturnDetailsController implements Serializable{

	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    
    @Autowired
    private PurchaseReturnDetailsRepository PurchaseReturnDetailsRepository;
    
    
    @GetMapping("/all")
	public ResponseEntity<Object> getAllPurchaseReturnDetails(){
		
		try {
			Iterable<PurchaseReturnDetails> PurchaseReturnDetails = PurchaseReturnDetailsRepository.findAll();
			return new ResponseEntity<Object>(PurchaseReturnDetails, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    
    @GetMapping("/by/{id}")
	public ResponseEntity<Object> getPurchaseReturnDetailsById(@PathVariable("id") Long id) {
		try {
			PurchaseReturnDetails contact = PurchaseReturnDetailsRepository.findById(id).get();
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
	public ResponseEntity<Object> createPurchaseReturnDetails(@RequestBody PurchaseReturnDetails PurchaseReturnDetails) {
		try {   
			PurchaseReturnDetails savedPurchaseReturnDetails = PurchaseReturnDetailsRepository.save(PurchaseReturnDetails);
			return new ResponseEntity<Object>(savedPurchaseReturnDetails, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Object> updateAdjustmentDetails(@PathVariable("id") Long id, @RequestBody PurchaseReturnDetails PurchaseReturnDetails) {
		try {
			PurchaseReturnDetails.setId(id);
			PurchaseReturnDetails savedPurchaseReturnDetails = PurchaseReturnDetailsRepository.save(PurchaseReturnDetails);
			return new ResponseEntity<Object>(savedPurchaseReturnDetails , HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deletePurchaseReturnDetails(@PathVariable("id") Long id) {
		try {
			PurchaseReturnDetailsRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
