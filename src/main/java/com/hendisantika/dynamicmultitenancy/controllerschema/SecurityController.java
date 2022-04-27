package com.hendisantika.dynamicmultitenancy.controllerschema;


import com.hendisantika.dynamicmultitenancy.security.RequestAuthorization;
import com.hendisantika.dynamicmultitenancy.tenant.entity.*;

import com.hendisantika.dynamicmultitenancy.tenant.repository.*;
//import com.hendisantika.dynamicmultitenancy.tenant.service.clientservice;


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

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-rest-api-dynamic-multi-tenancy-mysql-postgresql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/05/20
 * Time: 06.23
 */
@RestController
@RequestMapping("/api/stock")
public class SecurityController implements Serializable {

	private static final long serialVersionUID = 1L;
	
    //rivate static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);
    private Logger logger = LoggerFactory.getLogger(SecurityController.class);
   
    
    @Autowired
   	private PasswordResetsRepository PasswordResetsRepository;
    



				/************************ clients ****************************/
				//GET clients 
			@GetMapping("/passwordresets")
			public ResponseEntity<Object> getAllPasswordResets(){
					
					try {
						Iterable<PasswordResets> PasswordResetss = PasswordResetsRepository.findAll();
						return new ResponseEntity<Object>(PasswordResetss, HttpStatus.OK);
					} catch(Exception ex) {
						logger.error(ex.getMessage(), ex);
						return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
					}
				}
				//Get clients  by id 
			@GetMapping("/passwordresets/{id}")
			public ResponseEntity<Object> getPasswordResetsById(@PathVariable("id") Long id) {
						try {
							PasswordResets PasswordResetss = PasswordResetsRepository.findById(id).get();
							if(PasswordResetss != null) {
								return new ResponseEntity<Object>(PasswordResetss, HttpStatus.OK);				
							} else {
								return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
							}
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}   
			//POST clients
			@PostMapping("/passwordresets")
			public ResponseEntity<Object> createPasswordResets(@RequestBody PasswordResets PasswordResetss) {
						try {
							PasswordResets savedpasswordResetss = PasswordResetsRepository.save(PasswordResetss);
							return new ResponseEntity<Object>(savedpasswordResetss, HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}
					// update clients
			@PutMapping("/passwordresets/{id}")
			public ResponseEntity<Object> updatePasswordResets(@PathVariable("id") Long id, @RequestBody PasswordResets passwordresets) {
						try {
							passwordresets.setId(id);
							PasswordResets savedpasswordresets = PasswordResetsRepository.save(passwordresets);
							return new ResponseEntity<Object>(savedpasswordresets, HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}
					 
					// delete clients 
			@DeleteMapping("/passwordresets/{id}")
			public ResponseEntity<HttpStatus> deletePasswordResets(@PathVariable("id") Long id) {
						try {
							PasswordResetsRepository.deleteById(id);
							return new ResponseEntity<HttpStatus>(HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
						}
					}

	
}
