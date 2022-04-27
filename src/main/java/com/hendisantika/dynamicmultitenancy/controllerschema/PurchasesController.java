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
@RequestMapping("/api/Purchases")
public class PurchasesController implements Serializable{

	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    
    @Autowired
    private PurchasesRepository PurchasesRepository;
    
    
    @GetMapping("/all")
	public ResponseEntity<Object> getAllPurchases(){
		
		try {
			Iterable<Purchases> Purchases = PurchasesRepository.findAll();
			return new ResponseEntity<Object>(Purchases, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    
    @GetMapping("/by/{id}")
	public ResponseEntity<Object> getPurchasesById(@PathVariable("id") Long id) {
		try {
			Purchases contact = PurchasesRepository.findById(id).get();
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
	public ResponseEntity<Object> createPurchases(@RequestBody Purchases Purchases) {
		try {   
			Purchases savedPurchases = PurchasesRepository.save(Purchases);
			return new ResponseEntity<Object>(savedPurchases, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Object> updateAdjustmentDetails(@PathVariable("id") Long id, @RequestBody Purchases Purchases) {
		try {
			//Purchases.setId(id);
			Purchases savedPurchases = PurchasesRepository.save(Purchases);
			return new ResponseEntity<Object>(savedPurchases , HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
    
    @DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deletePurchases(@PathVariable("id") Long id) {
		try {
			PurchasesRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
		}
	}
}
