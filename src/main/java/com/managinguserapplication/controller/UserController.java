package com.managinguserapplication.controller;

import com.managinguserapplication.model.User;
import com.managinguserapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

/**
 * Created by Maciek on 2017-02-25.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/addUser/", method = RequestMethod.POST
            , consumes = "application/json")
    public String addUser(@RequestBody User user) {
        System.err.println(user.getBirthday());
        userService.create(user);
        return "Użytkownik " +user.getUsername() +" dodany do bazy";
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
    public String editUser(@PathVariable("id") Long id, @RequestBody User newUser) {
        return userService.update(id, newUser) ? "Użytkownik pomyślnie nadpisany" : "Coś poszło nie tak";
    }

    @RequestMapping(value = "/api/deleteUser/{id}", method = RequestMethod.DELETE)
    public boolean deleteUser(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
//        sdf.setLenient(true);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
//    }
}
