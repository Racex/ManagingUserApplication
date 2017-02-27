package com.managinguserapplication.repository;

import com.managinguserapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Maciek on 2017-02-25.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    User findById(Long id);
//    boolean create(User user);
}

