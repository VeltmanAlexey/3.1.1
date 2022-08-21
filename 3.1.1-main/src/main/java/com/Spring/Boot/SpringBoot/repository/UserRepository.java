package com.Spring.Boot.SpringBoot.repository;

import com.Spring.Boot.SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
