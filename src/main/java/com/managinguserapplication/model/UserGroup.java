package com.managinguserapplication.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Maciek on 2017-02-25.
 */
@Entity
@Table(name = "Grupa_Uzytkownikow")
public class UserGroup {
    @Id
    @GeneratedValue
    @Column(name = "Id_grupy_uzytkownika")
    private Long id;

    @Column(name = "nazwa")
    private String name;


    @OneToMany(mappedBy = "userGroup")
    @JsonManagedReference
    private List<User> usersList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }
}
