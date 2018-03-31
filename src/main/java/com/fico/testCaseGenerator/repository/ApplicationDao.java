package com.fico.testCaseGenerator.repository;

import com.cams.blaze.request.Application;
import org.springframework.data.repository.CrudRepository;


public interface ApplicationDao extends CrudRepository<Application, Long> {

    public Application save(Application application);

    public Application findById(Long id);
}
