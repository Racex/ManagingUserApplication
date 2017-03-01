package com.managinguserapplication.controller;

import com.managinguserapplication.model.UserGroup;
import com.managinguserapplication.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
    public void addUserGroup(@RequestBody UserGroup userGroup) {
        userGroupService.create(userGroup);
    }

    @RequestMapping(value = "/api/getUserGroup/{id}", method = RequestMethod.GET)
    public UserGroup getUserGrooupById(@PathVariable("id") Long id) {
        return userGroupService.findOne(id);
    }


    @RequestMapping(value = "/api/getUserGroup/all", method = RequestMethod.GET)
    public Collection<UserGroup> getAllUser() {
        return (Collection<UserGroup>) userGroupService.findAll();
    }


}
