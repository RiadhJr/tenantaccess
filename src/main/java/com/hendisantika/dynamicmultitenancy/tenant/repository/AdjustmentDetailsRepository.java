package com.hendisantika.dynamicmultitenancy.tenant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hendisantika.dynamicmultitenancy.tenant.entity.AdjustmentDetails;

@RepositoryRestResource

public interface AdjustmentDetailsRepository extends CrudRepository<AdjustmentDetails, Long> {

}
