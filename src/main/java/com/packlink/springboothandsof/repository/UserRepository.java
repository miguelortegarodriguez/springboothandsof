package com.packlink.springboothandsof.repository;


import com.packlink.springboothandsof.api.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String>{
}
