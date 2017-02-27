package com.managinguserapplication.service;

import com.managinguserapplication.model.User;

import java.util.Collection;
import java.util.List;

/**
 * Created by Maciek on 2017-02-25.
 */

    public interface UserService {

        Collection<User> findAll();

        User findOne(Long id);

        boolean create(User user);

        List<User> findUserInGroup(Long id);

        User update(User user);

        boolean delete(Long id);


    }

