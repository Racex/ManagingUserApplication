package com.managinguserapplication.service;

import com.managinguserapplication.model.UserGroup;
import com.managinguserapplication.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Maciej Kulikiewicz.
 * Date: 27.02.2017
 * Time: 22:42
 */
@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    UserGroupRepository userGroupRepository;

    @Override
    public Collection<UserGroup> findAll() {
        return userGroupRepository.findAll();
    }

    @Override
    public UserGroup findOne(Long id) {
        return userGroupRepository.getOne(id);
    }

    @Override
    public boolean create(UserGroup userGroup) {
        userGroupRepository.save(userGroup);
        return false;
    }

    @Override
    public UserGroup findByName(String name) {
        return userGroupRepository.findByName(name);
    }



}
