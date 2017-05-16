package com.dripcloud.demo.order.service;

import com.dripcloud.demo.order.domain.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "client", path = "client")
interface ClientRepository extends MongoRepository<Client, String>{

    List<Client> findByLastName(@Param("name") String name);
}