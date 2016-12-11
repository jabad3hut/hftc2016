package org.pcat.inventory.dao;

import org.pcat.inventory.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
