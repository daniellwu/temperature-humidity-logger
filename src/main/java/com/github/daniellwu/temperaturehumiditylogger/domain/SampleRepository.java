package com.github.daniellwu.temperaturehumiditylogger.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//FIXME! spring data rest does not work with IdClass
@RepositoryRestResource(collectionResourceRel = "sample", path = "sample")
public interface SampleRepository extends PagingAndSortingRepository<Sample, Sample.SamplePK> {
}
