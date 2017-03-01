package com.managinguserapplication.repository;

import com.managinguserapplication.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Maciej Kulikiewicz.
 * Date: 27.02.2017
 * Time: 00:31
 */

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
    List<UserGroup> findAll();

    UserGroup findById(Long id);

    UserGroup findByName(String name);
}
