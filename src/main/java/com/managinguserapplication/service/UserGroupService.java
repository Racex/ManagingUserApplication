package com.managinguserapplication.service;

import com.managinguserapplication.model.User;
import com.managinguserapplication.model.UserGroup;

import java.util.Collection;

/**
 * Created by Maciej Kulikiewicz.
 * Date: 27.02.2017
 * Time: 22:42
 */
public interface UserGroupService {

    Collection<UserGroup> findAll();

    UserGroup findOne(Long id);

    boolean create(UserGroup userGroup);


    UserGroup findByName(String name);
}
