package com.hendisantika.dynamicmultitenancy.tenant.repository;
import com.hendisantika.dynamicmultitenancy.tenant.entity.*;
import org.springframework.data.repository.CrudRepository;



public interface ProductsRepository extends CrudRepository<Products, Long> {

}
