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
@RequestMapping("/api/settings")
public class StockController implements Serializable {

	private static final long serialVersionUID = 1L;
	
    //rivate static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);
    private Logger logger = LoggerFactory.getLogger(StockController.class);
    @Autowired
	private CategoriesRepository categorieRepository;
    
    @Autowired
	private ProductsRepository ProductsRepository;
    
    @Autowired
   	private ProductVariantsRepository ProductVariantsRepository;
    
    @Autowired
   	private ProductWarehouseRepository ProductWarehouseRepository;
    
    @Autowired
   	private ExpenseCategoriesRepository ExpenseCategoriesRepository;
    
    @Autowired
   	private ExpensesRepository ExpensesRepository;
    
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

	    /***************************expenses***************************/
		//GET expenses
		@GetMapping("/expenses")
		public ResponseEntity<Object> getAllExpenses(){
			
			try {
				Iterable<Expenses> contacts = ExpensesRepository.findAll();
				return new ResponseEntity<Object>(contacts, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		//Get expenses by id 
			@GetMapping("/expenses/{id}")
			public ResponseEntity<Object> getExpensesById(@PathVariable("id") Long id) {
				try {
					Expenses contact = ExpensesRepository.findById(id).get();
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
		//POST expenses
			@PostMapping("/expenses")
			public ResponseEntity<Object> createExpenses(@RequestBody Expenses expenses) {
				try {
					
					//expenses.set ID expense_category_id
					//expenses.set ID expense_user_id
					//expenses.set ID expense_warehouse_id
					Expenses savedExpenses = ExpensesRepository.save(expenses);
					return new ResponseEntity<Object>(savedExpenses, HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}
			// update expenses
			@PutMapping("/expenses/{id}")
			public ResponseEntity<Object> updateExpenses(@PathVariable("id") Long id, @RequestBody Expenses expenses) {
				try {
					expenses.setId(id);
					Expenses savedexpenses = ExpensesRepository.save(expenses);
					return new ResponseEntity<Object>(savedexpenses, HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}
			 
			// delete expenses
			@DeleteMapping("/expenses/{id}")
			public ResponseEntity<HttpStatus> deleteExpenses(@PathVariable("id") Long id) {
				try {
					categorieRepository.deleteById(id);
					return new ResponseEntity<HttpStatus>(HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
				}
			}

	    /***************************expense_categories***************************/
		//GET expense_categories
		@GetMapping("/expense_categories")
		public ResponseEntity<Object> getAllExpCategories(){
			
			try {
				Iterable<ExpenseCategories> expenseCategories = ExpenseCategoriesRepository.findAll();
				return new ResponseEntity<Object>(expenseCategories, HttpStatus.OK);
			} catch(Exception ex) {
				logger.error(ex.getMessage(), ex);
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
		}
		//Get expense_categories by id 
			@GetMapping("/expense_categories/{id}")
			public ResponseEntity<Object> getExpCategoriesById(@PathVariable("id") Long id) {
				try {
					ExpenseCategories expenseCategories = ExpenseCategoriesRepository.findById(id).get();
					if(expenseCategories != null) {
						return new ResponseEntity<Object>(expenseCategories, HttpStatus.OK);				
					} else {
						return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
					}
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}   
		//POST expense_categories
			@PostMapping("/expense_categories")
			public ResponseEntity<Object> createExpCategories(@RequestBody ExpenseCategories expenseCategories) {
				try {
					ExpenseCategories expenseCategoriess = ExpenseCategoriesRepository.save(expenseCategories);
					return new ResponseEntity<Object>(expenseCategoriess, HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}
			// update expense_categories
			@PutMapping("/expense_categories/{id}")
			public ResponseEntity<Object> updateExpCategories(@PathVariable("id") Long id, @RequestBody ExpenseCategories expenseCategories) {
				try {
					expenseCategories.setId(id);
					ExpenseCategories savedexpenseCategories = ExpenseCategoriesRepository.save(expenseCategories);
					return new ResponseEntity<Object>(savedexpenseCategories, HttpStatus.OK);
				} catch(Exception ex) {
					logger.error(ex.getMessage(), ex);
					return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
				}
			}
			 
			// delete expense_categories
			@DeleteMapping("/expense_categories/{id}")
			public ResponseEntity<HttpStatus> deleteExpCategories(@PathVariable("id") Long id) {
				try {
					ExpenseCategoriesRepository.deleteById(id);
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
