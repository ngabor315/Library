package hu.webalk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.webalk.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{

}
