package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ehc on 8/9/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
