package com.managinguserapplication.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Maciek on 2017-02-25.
 */
@Entity
@Table(name = "uzytkownik")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "Id_uzytkownika")
    private Long id;

    @Column(name = "Nazwa")
    private String username;

    @Column(name = "Haslo")
    private String password;

    @Column(name = "Imie")
    private String name;

    @Column(name = "Nazwisko")
    private String surrname;

    @Column(name = "Data_Urodzenia")
    private Date birthday;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_grupy_uzytkownika")
    @JsonBackReference
    private UserGroup userGroup;

    @Transient
    private String userGroupName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }


}
