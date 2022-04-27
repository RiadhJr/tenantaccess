package com.hendisantika.dynamicmultitenancy.controllerschema;


import com.hendisantika.dynamicmultitenancy.security.RequestAuthorization;
import com.hendisantika.dynamicmultitenancy.tenant.entity.*;

import com.hendisantika.dynamicmultitenancy.tenant.repository.*;
import com.hendisantika.dynamicmultitenancy.tenant.service.ProductService;


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
@RequestMapping("/api/purchase")
public class PurchaseController implements Serializable {

	private static final long serialVersionUID = 1L;
	
    //private static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);
    private Logger logger = LoggerFactory.getLogger(PurchaseController.class);
    
    @Autowired
	private CategoriesRepository categorieRepository;
    
    @Autowired
	private ProductsRepository ProductsRepository;
    
    @Autowired
   	private ProductVariantsRepository ProductVariantsRepository;
    
    @Autowired
   	private ProductWarehouseRepository ProductWarehouseRepository;
     
    @Autowired
   	private PaymentPurchaseReturnsRepository PaymentPurchaseReturnsRepository;
   
    @Autowired
   	private PaymentPurchasesRepository PaymentPurchasesRepository;
    
    @Autowired
    private PaymentSaleReturnsRepository PaymentSaleReturnsRepository;
    
    /***************************Payment_Sale_Returns***************************/
	//GET payment_purchases
	@GetMapping("/paymentsalereturns")
	public ResponseEntity<Object> getAllPaymentSaleReturns(){
		
		try {
			Iterable<PaymentSaleReturns> PaymentSaleReturns = PaymentSaleReturnsRepository.findAll();
			return new ResponseEntity<Object>(PaymentSaleReturns, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	//Get payment_purchases by id 
		@GetMapping("/paymentsalereturns/{id}")
		public ResponseEntity<Object> getPaymentSaleReturnsById(@PathVariable("id") Long id) {
			try {
				PaymentSaleReturns paymentsalereturns = PaymentSaleReturnsRepository.findById(id).get();
				if(paymentsalereturns != null) {
					return new ResponseEntity<Object>(paymentsalereturns, HttpStatus.OK);				
				} else {
					return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
				}
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}   
	//POST payment_purchases
		@PostMapping("/paymentsalereturns")
		public ResponseEntity<Object> createPaymentSaleReturns(@RequestBody PaymentSaleReturns paymentsalereturns) {
			try {
				PaymentSaleReturns paymentsalereturnss = PaymentSaleReturnsRepository.save(paymentsalereturns);
				return new ResponseEntity<Object>(paymentsalereturnss, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		// update payment_purchases
		@PutMapping("/paymentsalereturns/{id}")
		public ResponseEntity<Object> updatePaymentSaleReturns(@PathVariable("id") Long id, @RequestBody PaymentSaleReturns paymentsalereturns) {
			try {
				paymentsalereturns.setId(id);
				PaymentSaleReturns paymentsalereturnss = PaymentSaleReturnsRepository.save(paymentsalereturns);
				return new ResponseEntity<Object>(paymentsalereturnss, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		 
		// delete payment_purchases
		@DeleteMapping("/paymentsalereturns/{id}")
		public ResponseEntity<HttpStatus> deletePaymentSaleReturns(@PathVariable("id") Long id) {
			try {
				PaymentSaleReturnsRepository.deleteById(id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
			}
		}

    /***************************payment_purchases***************************/
	//GET payment_purchases
	@GetMapping("/paymentpurchases")
	public ResponseEntity<Object> getAllPaymentPurchases(){
		
		try {
			Iterable<PaymentPurchases> paymentpurchase = PaymentPurchasesRepository.findAll();
			return new ResponseEntity<Object>(paymentpurchase, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	//Get payment_purchases by id 
		@GetMapping("/paymentpurchases/{id}")
		public ResponseEntity<Object> getPaymentPurchasesById(@PathVariable("id") Long id) {
			try {
				PaymentPurchases paymentpurchase = PaymentPurchasesRepository.findById(id).get();
				if(paymentpurchase != null) {
					return new ResponseEntity<Object>(paymentpurchase, HttpStatus.OK);				
				} else {
					return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
				}
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}   
	//POST payment_purchases
		@PostMapping("/paymentpurchases")
		public ResponseEntity<Object> createPaymentPurchases(@RequestBody PaymentPurchases paymentpurchases) {
			try {
				PaymentPurchases savedpaymentpurchase = PaymentPurchasesRepository.save(paymentpurchases);
				return new ResponseEntity<Object>(savedpaymentpurchase, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		// update payment_purchases
		@PutMapping("/paymentpurchases/{id}")
		public ResponseEntity<Object> updatePaymentPurchases(@PathVariable("id") Long id, @RequestBody PaymentPurchases paymentpurchases) {
			try {
				paymentpurchases.setId(id);
				PaymentPurchases savedpaymentpurchase = PaymentPurchasesRepository.save(paymentpurchases);
				return new ResponseEntity<Object>(savedpaymentpurchase, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		 
		// delete payment_purchases
		@DeleteMapping("/paymentpurchases/{id}")
		public ResponseEntity<HttpStatus> deletePaymentPurchases(@PathVariable("id") Long id) {
			try {
				PaymentPurchasesRepository.deleteById(id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
			}
		}

    
    /***************************PaymentPurchaseReturns***************************/
	//GET PaymentPurchaseReturns
	@GetMapping("/paymentpurchasereturns")
	public ResponseEntity<Object> getAllPaymentPurchaseReturns(){
		
		try {
			Iterable<PaymentPurchaseReturns> paymentpurchasereturns = PaymentPurchaseReturnsRepository.findAll();
			return new ResponseEntity<Object>(paymentpurchasereturns, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	//Get PaymentPurchaseReturns by id 
		@GetMapping("/paymentpurchasereturns/{id}")
		public ResponseEntity<Object> getPaymentPurchaseReturnsById(@PathVariable("id") Long id) {
			try {
				PaymentPurchaseReturns paymentpurchasereturns = PaymentPurchaseReturnsRepository.findById(id).get();
				if(paymentpurchasereturns != null) {
					return new ResponseEntity<Object>(paymentpurchasereturns, HttpStatus.OK);				
				} else {
					return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
				}
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}   
	//POST paymentpurchasereturns
		@PostMapping("/paymentpurchasereturns")
		public ResponseEntity<Object> createPaymentPurchaseReturns(@RequestBody PaymentPurchaseReturns paymentpurchasereturns) {
			try {
				PaymentPurchaseReturns savedpaymentpurchasereturns = PaymentPurchaseReturnsRepository.save(paymentpurchasereturns);
				return new ResponseEntity<Object>(savedpaymentpurchasereturns, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		// update paymentpurchasereturns
		@PutMapping("/paymentpurchasereturns/{id}")
		public ResponseEntity<Object> updatePaymentPurchaseReturns(@PathVariable("id") Long id, @RequestBody PaymentPurchaseReturns paymentpurchasereturns) {
			try {
				paymentpurchasereturns.setId(id);
				PaymentPurchaseReturns savedpaymentpurchasereturns = PaymentPurchaseReturnsRepository.save(paymentpurchasereturns);
				return new ResponseEntity<Object>(savedpaymentpurchasereturns, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		 
		// delete paymentpurchasereturns
		@DeleteMapping("/paymentpurchasereturns/{id}")
		public ResponseEntity<HttpStatus> deletePaymentPurchaseReturns(@PathVariable("id") Long id) {
			try {
				PaymentPurchaseReturnsRepository.deleteById(id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
			}
		}

    /***************************categories***************************/
	//GET Categories
	@GetMapping("/categories")
	public ResponseEntity<Object> getAllCategories(){
		
		try {
			Iterable<Categories> contacts = categorieRepository.findAll();
			return new ResponseEntity<Object>(contacts, HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	//Get categorie by id 
		@GetMapping("/categories/{id}")
		public ResponseEntity<Object> getCategorieById(@PathVariable("id") Long id) {
			try {
				Categories contact = categorieRepository.findById(id).get();
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
	//POST categorie
		@PostMapping("/categories")
		public ResponseEntity<Object> createCategories(@RequestBody Categories categorie) {
			try {
				Categories savedCategorie = categorieRepository.save(categorie);
				return new ResponseEntity<Object>(savedCategorie, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		// update categorie
		@PutMapping("/categories/{id}")
		public ResponseEntity<Object> updateCategories(@PathVariable("id") Long id, @RequestBody Categories categorie) {
			try {
				categorie.setId(id);
				Categories savedCategorie = categorieRepository.save(categorie);
				return new ResponseEntity<Object>(savedCategorie, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		 
		// delete categorie
		@DeleteMapping("/categories/{id}")
		public ResponseEntity<HttpStatus> deleteCategories(@PathVariable("id") Long id) {
			try {
				categorieRepository.deleteById(id);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
			}
		}

		/************************ Products ****************************/
		//GET Products
		@GetMapping("/Products")
		public ResponseEntity<Object> getAllProductss(){
			
			try {
				Iterable<Products> Productss = ProductsRepository.findAll();
				return new ResponseEntity<Object>(Productss, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		//Get Products by id 
			@GetMapping("/Products/{id}")
			public ResponseEntity<Object> getContactById(@PathVariable("id") Long id) {
				try {
					Products Productss = ProductsRepository.findById(id).get();
					if(Productss != null) {
						return new ResponseEntity<Object>(Productss, HttpStatus.OK);				
					} else {
						return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
					}
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}   
		//POST Products
			@PostMapping("/Products")
			public ResponseEntity<Object> createContacts(@RequestBody Products Products) {
				try {
					Products savedProducts = ProductsRepository.save(Products);
					return new ResponseEntity<Object>(savedProducts, HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}
			// update Products
			@PutMapping("/products/{id}")
			public ResponseEntity<Object> updateContacts(@PathVariable("id") Long id, @RequestBody Products Products) {
				try {
					Products.setId(id);
					Products savedProducts = ProductsRepository.save(Products);
					return new ResponseEntity<Object>(savedProducts, HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}
			 
			// delete Products
			@DeleteMapping("/products/{id}")
			public ResponseEntity<HttpStatus> deleteContacts(@PathVariable("id") Long id) {
				try {
					categorieRepository.deleteById(id);
					return new ResponseEntity<HttpStatus>(HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
				}
			}

			/************************ ProductVariants ****************************/
			//GET productvariants
			@GetMapping("/productvariants")
			public ResponseEntity<Object> getAllProductVariants(){
				
				try {
					Iterable<ProductVariants> Productss = ProductVariantsRepository.findAll();
					return new ResponseEntity<Object>(Productss, HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}
			//Get productvariants by id 
				@GetMapping("/productvariants/{id}")
				public ResponseEntity<Object> getProductVariantById(@PathVariable("id") Long id) {
					try {
						ProductVariants Productss = ProductVariantsRepository.findById(id).get();
						if(Productss != null) {
							return new ResponseEntity<Object>(Productss, HttpStatus.OK);				
						} else {
							return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
						}
					} catch(Exception ex) {
						logger.error(ex.getMessage(), ex);
						return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
					}
				}   
			//POST productvariants
				@PostMapping("/productvariants")
				public ResponseEntity<Object> createProductVariants(@RequestBody ProductVariants Products) {
					try {
						ProductVariants savedProducts = ProductVariantsRepository.save(Products);
						return new ResponseEntity<Object>(savedProducts, HttpStatus.OK);
					} catch(Exception ex) {
						logger.error(ex.getMessage(), ex);
						return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
					}
				}
				// update productvariants
				@PutMapping("/productvariants/{id}")
				public ResponseEntity<Object> updateProductVariants(@PathVariable("id") Long id, @RequestBody ProductVariants Products) {
					try {
						Products.setId(id);
						ProductVariants savedProducts = ProductVariantsRepository.save(Products);
						return new ResponseEntity<Object>(savedProducts, HttpStatus.OK);
					} catch(Exception ex) {
						logger.error(ex.getMessage(), ex);
						return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
					}
				}
				 
				// delete ProductVariant
				@DeleteMapping("/productvariants/{id}")
				public ResponseEntity<HttpStatus> deleteProductVariants(@PathVariable("id") Long id) {
					try {
						ProductVariantsRepository.deleteById(id);
						return new ResponseEntity<HttpStatus>(HttpStatus.OK);
					} catch(Exception ex) {
						logger.error(ex.getMessage(), ex);
						return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
					}
				}

				/************************ Product Warehouse ****************************/
				//GET Product Warehouse
				@GetMapping("/productwarehouses")
				public ResponseEntity<Object> getAllProductWarehous(){
					
					try {
						Iterable<ProductWarehouse> Productss = ProductWarehouseRepository.findAll();
						return new ResponseEntity<Object>(Productss, HttpStatus.OK);
					} catch(Exception ex) {
						logger.error(ex.getMessage(), ex);
						return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
					}
				}
				//Get product warehouss by id 
					@GetMapping("/productwarehouss/{id}")
					public ResponseEntity<Object> getProductWarehousesById(@PathVariable("id") Long id) {
						try {
							ProductWarehouse Productss = ProductWarehouseRepository.findById(id).get();
							if(Productss != null) {
								return new ResponseEntity<Object>(Productss, HttpStatus.OK);				
							} else {
								return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
							}
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}   
				//POST product warehouss
					@PostMapping("/productwarehouss")
					public ResponseEntity<Object> createProductWarehouses(@RequestBody ProductWarehouse Products) {
						try {
							ProductWarehouse savedProducts = ProductWarehouseRepository.save(Products);
							return new ResponseEntity<Object>(savedProducts, HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}
					// update product warehouss
					@PutMapping("/productwarehouss/{id}")
					public ResponseEntity<Object> updateProductWarehouses(@PathVariable("id") Long id, @RequestBody ProductWarehouse Products) {
						try {
							Products.setId(id);
							ProductWarehouse savedProducts = ProductWarehouseRepository.save(Products);
							return new ResponseEntity<Object>(savedProducts, HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
						}
					}
					 
					// delete product warehouss
					@DeleteMapping("/productwarehouss/{id}")
					public ResponseEntity<HttpStatus> deleteProductWarehouses(@PathVariable("id") Long id) {
						try {
							ProductWarehouseRepository.deleteById(id);
							return new ResponseEntity<HttpStatus>(HttpStatus.OK);
						} catch(Exception ex) {
							logger.error(ex.getMessage(), ex);
							return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
						}
					}

}
