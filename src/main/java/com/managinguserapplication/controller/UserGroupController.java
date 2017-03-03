package com.managinguserapplication.controller;

import com.managinguserapplication.model.User;
import com.managinguserapplication.model.UserGroup;
import com.managinguserapplication.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * Created by Maciej Kulikiewicz.
 * Date: 27.02.2017
 * Time: 13:27
 */

@RestController
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @RequestMapping(value = "/api/addUserGroup/", method = RequestMethod.POST, consumes = "application/json")
    public String addUserGroup(@RequestBody UserGroup userGroup) {
        if(userGroupService.create(userGroup))
        return "Grupa " +userGroup.getName() + " została dodana";
    return "Grupa o podanej nazwie juz istnieje";
    }

    @RequestMapping(value = "/api/getUserGroup/{id}", method = RequestMethod.GET)
    public UserGroup getUserGrooupById(@PathVariable("id") Long id) {
        return userGroupService.findOne(id);
    }

    @RequestMapping(value = "/api/editUserGroup/{id}", method = RequestMethod.POST)
    public String updateUserGroup(@PathVariable("id") Long id , @RequestBody UserGroup userGroup) {
        return userGroupService.update(id,userGroup) ? "Zaktualizowano grupę" : "Nie mozna zaktualizowac grupy";
    }


    @RequestMapping(value = "/api/getUserGroup/all", method = RequestMethod.GET)
    public Collection<UserGroup> getAllUser() {
        return (Collection<UserGroup>) userGroupService.findAll();
    }

    @RequestMapping(value = "/api/deleteUserGroup/{id}", method = RequestMethod.DELETE)
    public boolean deleteUserGroup(@PathVariable("id") Long id) {
        return userGroupService.delete(id);
    }

    @RequestMapping(value = "/api/getUserGroupForUser/{id}", method = RequestMethod.GET)
    public Collection<User> getUserGroupForUser(@PathVariable("id") Long id) {
        return userGroupService.findOne(id).getUsersList();
    }


}
