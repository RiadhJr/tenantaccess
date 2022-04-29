package com.hendisantika.dynamicmultitenancy.tenant.repository;
import com.hendisantika.dynamicmultitenancy.tenant.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource

public interface UnitsRepository extends CrudRepository<Units, Long> {

}
