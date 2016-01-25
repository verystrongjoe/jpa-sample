package org.test.skeleton.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.test.skeleton.entity.User;

public interface UserDao extends CrudRepository<User, Long> {

    User findByEmail(@Param("email") String email);
}
