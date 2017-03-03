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
        return userGroupRepository.findById(id);
    }

    @Override
    public boolean create(UserGroup userGroup) {
        for(UserGroup x : userGroupRepository.findAll())
        {
            if(x.getName().equals(userGroup.getName()))
            return false;
        }
        userGroupRepository.save(userGroup);
        return true;
    }

    @Override
    public UserGroup findByName(String name) {
        return userGroupRepository.findByName(name);
    }

    @Override
    public boolean delete(Long id) {
        try {
            userGroupRepository.delete(id);
        }catch (Exception e)
        {
            return false;
        }return true;
    }

    @Override
    public boolean update(Long id, UserGroup userGroup) {
        if(userGroup.getName() == null)
        return false;
        userGroup.setId(id);
        userGroupRepository.save(userGroup);
        return true;

    }
}
