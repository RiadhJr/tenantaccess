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
@RequestMapping("/api/Settingss")
public class ClientsController implements Serializable {

	private static final long serialVersionUID = 1L;
	
    //rivate static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);
    private Logger logger = LoggerFactory.getLogger(ClientsController.class);
   
    
    @Autowired
   	private ClientsRepository ClientsRepository;
    
    @Autowired
   	private CurrenciesRepository CurrenciesRepository;


				/************************ clients ****************************/
				//GET clients 
				@GetMapping("/Clientss")
				public ResponseEntity<Object> getAllProductWarehous(){
					
					try {
						Iterable<Clients> clientss = ClientsRepository.findAll();
						return new ResponseEntity<Object>(clientss, HttpStatus.OK);
					} catch(Exception ex) {
						logger.error(ex.getMessage(), ex);
						return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
					}
				}
				//Get clients  by id 
					@GetMapping("/clients/{id}")
					public ResponseEntity<Object> getClientssById(@PathVariable("id") Long id) {
						try {
							Clients clientss = ClientsRepository.findById(id).get();
							if(clientss != null) {
								return new ResponseEntity<Object>(clientss, HttpStatus.OK);				
							} else {
								return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
							}
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}   
				//POST clients
					@PostMapping("/clients")
					public ResponseEntity<Object> createClientss(@RequestBody Clients clients) {
						try {
							Clients savedclients = ClientsRepository.save(clients);
							return new ResponseEntity<Object>(savedclients, HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}
					// update clients
					@PutMapping("/clients/{id}")
					public ResponseEntity<Object> updateClientss(@PathVariable("id") Long id, @RequestBody Clients clients) {
						try {
							clients.setId(id);
							Clients savedclients = ClientsRepository.save(clients);
							return new ResponseEntity<Object>(savedclients, HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}
					 
					// delete clients 
					@DeleteMapping("/clients/{id}")
					public ResponseEntity<HttpStatus> deleteClientss(@PathVariable("id") Long id) {
						try {
							ClientsRepository.deleteById(id);
							return new ResponseEntity<HttpStatus>(HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
						}
					}

					/************************ currencies ****************************/
					//GET currencies 
					@GetMapping("/currencies")
					public ResponseEntity<Object> getAllCurrenciess(){
						
						try {
							Iterable<Currencies> Currencies = CurrenciesRepository.findAll();
							return new ResponseEntity<Object>(Currencies, HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}
					//Get currencies  by id 
						@GetMapping("/currencies/{id}")
						public ResponseEntity<Object> getCurrenciesById(@PathVariable("id") Long id) {
							try {
								Currencies Currencies = CurrenciesRepository.findById(id).get();
								if(Currencies != null) {
									return new ResponseEntity<Object>(Currencies, HttpStatus.OK);				
								} else {
									return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
								}
							} catch(Exception ex) {
								logger.error(ex.getMessage(), ex);
								return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
							}
						}   
					//POST currencies
						@PostMapping("/currencies")
						public ResponseEntity<Object> createCurrencies(@RequestBody Currencies Currencies) {
							try {
								Currencies Currenciess = CurrenciesRepository.save(Currencies);
								return new ResponseEntity<Object>(Currenciess, HttpStatus.OK);
							} catch(Exception ex) {
								logger.error(ex.getMessage(), ex);
								return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
							}
						}
						// update currencies
						@PutMapping("/currencies/{id}")
						public ResponseEntity<Object> updateCurrencies(@PathVariable("id") Long id, @RequestBody Currencies Currencies) {
							try {
								Currencies.setId(id);
								Currencies Currenciess = CurrenciesRepository.save(Currencies);
								return new ResponseEntity<Object>(Currenciess, HttpStatus.OK);
							} catch(Exception ex) {
								logger.error(ex.getMessage(), ex);
								return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
							}
						}
						 
						// delete currencies 
						@DeleteMapping("/currencies/{id}")
						public ResponseEntity<HttpStatus> deleteCurrencies(@PathVariable("id") Long id) {
							try {
								CurrenciesRepository.deleteById(id);
								return new ResponseEntity<HttpStatus>(HttpStatus.OK);
							} catch(Exception ex) {
								logger.error(ex.getMessage(), ex);
								return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
							}
						}

}
