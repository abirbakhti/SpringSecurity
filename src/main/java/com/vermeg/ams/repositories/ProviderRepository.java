package com.vermeg.ams.repositories;

import org.springframework.data.repository.CrudRepository;
import com.vermeg.ams.entities.Provider;

public interface ProviderRepository extends CrudRepository<Provider, Long> {

}