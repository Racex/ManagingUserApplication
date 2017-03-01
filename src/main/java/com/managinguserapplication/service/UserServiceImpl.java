package com.managinguserapplication.service;

import com.managinguserapplication.model.User;
import com.managinguserapplication.repository.UserGroupRepository;
import com.managinguserapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
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
    public Collection<User> findAll() {
        List<User> temp = userRepository.findAll();
        for (User x : temp) {
            if (x.getUserGroup() != null)
                x.setUserGroupName(x.getUserGroup().getName());
        }
        return temp;
    }

    @Override
    public User findOne(Long id) {
        User temp = userRepository.findById(id);
        if (temp.getUserGroup() != null)
            temp.setUserGroupName(temp.getUserGroup().getName());
        return temp;
    }


    @Override
    public boolean create(User user) {
        if (user.getUserGroupName() != null)
            user.setUserGroup(userGroupRepository.findByName(user.getUserGroupName()));
        userRepository.save(user);
        return true;
    }

    @Override
    public List<User> findUserInGroup(Long id) {
        return userGroupRepository.findOne(id).getUsersList();
    }

    @Override
    public boolean update(Long id, User newUser) {
        newUser.setId(id);
        if(newUser.getUserGroupName() != null)
        newUser.setUserGroup(userGroupRepository.findByName(newUser.getUserGroupName()));
        userRepository.save(newUser);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        userRepository.delete(id);
        return true;
    }
}
