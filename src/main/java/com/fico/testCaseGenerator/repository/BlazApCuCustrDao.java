package com.fico.testCaseGenerator.repository;

import conversionRequest.BlazApCuCustr;
import org.springframework.data.repository.CrudRepository;


public interface BlazApCuCustrDao extends CrudRepository<BlazApCuCustr, Long> {

    public BlazApCuCustr save(BlazApCuCustr blazApCuCustr);

    public BlazApCuCustr findById(Long id);
}
