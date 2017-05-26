package hu.webalk.repository;

import org.springframework.data.repository.CrudRepository;

import hu.webalk.entity.BorrowerEntity;

public interface BorrowerRepository extends CrudRepository<BorrowerEntity, Long>{

}
