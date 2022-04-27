package com.hendisantika.dynamicmultitenancy.tenant.repository;
import com.hendisantika.dynamicmultitenancy.tenant.entity.*;
import org.springframework.data.repository.CrudRepository;



public interface PaymentWithCreditCardRepository extends CrudRepository<PaymentWithCreditCard, Long> {

}
