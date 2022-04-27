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
@RequestMapping("/api/PurchaseDetails")
public class PurchaseDetailsController implements Serializable{

	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    
    @Autowired
    private PurchaseDetailsRepository PurchaseDetailsRepository;
    
    
    @GetMapping("/all")
	public ResponseEntity<Object> getAllPurchaseDetails(){
		
		try {
			Iterable<PurchaseDetails> PurchaseDetails = PurchaseDetailsRepository.findAll();
			return new ResponseEntity<Object>(PurchaseDetails, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    
    @GetMapping("/by/{id}")
	public ResponseEntity<Object> getPurchaseDetailsById(@PathVariable("id") Long id) {
		try {
			PurchaseDetails PurchaseDetails = PurchaseDetailsRepository.findById(id).get();
			if(PurchaseDetails != null) {
				return new ResponseEntity<Object>(PurchaseDetails, HttpStatus.OK);				
			} else {
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
			}
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PostMapping("/create")
	public ResponseEntity<Object> createPurchaseDetails(@RequestBody PurchaseDetails PurchaseDetails) {
		try {   
			PurchaseDetails savedPurchaseDetails = PurchaseDetailsRepository.save(PurchaseDetails);
			return new ResponseEntity<Object>(savedPurchaseDetails, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Object> updatePurchaseDetails(@PathVariable("id") Long id, @RequestBody PurchaseDetails PurchaseDetails) {
		try {
			PurchaseDetails.setId(id);
			PurchaseDetails savedPurchaseDetails = PurchaseDetailsRepository.save(PurchaseDetails);
			return new ResponseEntity<Object>(savedPurchaseDetails , HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteTransfers(@PathVariable("id") Long id) {
		try {
			PurchaseDetailsRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
