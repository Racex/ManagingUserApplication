package com.managinguserapplication.service;

import com.managinguserapplication.model.User;
import com.managinguserapplication.repository.UserGroupRepository;
import com.managinguserapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Maciek on 2017-02-25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserGroupRepository userGroupRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean create(User user) {
//        userRepository.create(user);
        return true;
    }

    @Override
    public List<User> findUserInGroup(Long id) {
    return userGroupRepository.findOne(id).getUsersList();
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
