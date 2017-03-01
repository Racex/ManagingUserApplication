package com.managinguserapplication.controller;

import com.managinguserapplication.model.User;
import com.managinguserapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Maciek on 2017-02-25.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/addUser/", method = RequestMethod.POST
            , consumes = "application/json")
    public void addUser(@RequestBody User user) {
        userService.create(user);
    }

    @RequestMapping(value = "/api/getUser/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }

    @RequestMapping(value = "/api/getUserFromGroup/{id}", method = RequestMethod.GET)
    public List<User> getUserFromGroup(@PathVariable("id") Long id) {
        return userService.findUserInGroup(id);
    }

    @RequestMapping(value = "/api/getUser/all", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return (List<User>) userService.findAll();
    }

    @RequestMapping(value = "/api/editUser/{id}", method = RequestMethod.POST)
    public boolean editUser(@PathVariable("id") Long id, @RequestBody User newUser) {

        return userService.update(id, newUser);
    }

    @RequestMapping(value = "/api/deleteUser/{id}", method = RequestMethod.DELETE)
    public boolean deleteUser(@PathVariable("id") Long id) {
        return userService.delete(id);
    }


}
