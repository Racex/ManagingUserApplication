package com.managinguserapplication.controller;

import com.managinguserapplication.model.User;
import com.managinguserapplication.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Maciek on 2017-02-25.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/addUser/{json}" , method = RequestMethod.POST)
    public void addUser(JSONObject jsonObject)
    {
        userService.create(new User());
    }

    @RequestMapping(value = "/api/getUser/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }

    @RequestMapping(value = "/api/getUserFromGroup/{id}", method = RequestMethod.GET)
    public List<User> getUserFromGroup(@PathVariable("id") Long id) {
        return userService.findUserInGroup(id);
    }

    @RequestMapping(value = "/api/getUser/all" , method = RequestMethod.GET)
    public List<User> getAllUser()
    {
        return (List<User>) userService.findAll();
    }
}
