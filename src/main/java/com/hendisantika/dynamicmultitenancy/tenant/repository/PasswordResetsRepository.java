package com.hendisantika.dynamicmultitenancy.tenant.repository;
import com.hendisantika.dynamicmultitenancy.tenant.entity.*;
import org.springframework.data.repository.CrudRepository;



public interface PasswordResetsRepository extends CrudRepository<PasswordResets, Long> {

}
