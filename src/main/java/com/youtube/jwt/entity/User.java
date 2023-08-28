package com.youtube.jwt.entity;
//5. hold user entity after check endpoint in createNewRole with postman.


import org.apache.catalina.Group;
import org.apache.catalina.UserDatabase;

import javax.persistence.*;
import java.util.Iterator;
import java.util.Set;

@Entity
public class User implements org.apache.catalina.User {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    @Id
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String userPassword;

    //one user have many roles so we create here associates
    //association have one table to many relation.
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)

    //this is called snippet-start
    @JoinTable(name="USER_ROLE",
    joinColumns = {
            @JoinColumn(name = "USER_ID")
    },
            inverseJoinColumns = {
                @JoinColumn(name = "ROLE_ID")
            }
    )
    //this is called snippet-ends
    private Set<Role> role;


    @Override
    public String getFullName() {
        return null;
    }

    @Override
    public void setFullName(String s) {

    }

    @Override
    public Iterator<Group> getGroups() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setPassword(String s) {

    }

    @Override
    public Iterator<org.apache.catalina.Role> getRoles() {
        return null;
    }

    @Override
    public UserDatabase getUserDatabase() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public void setUsername(String s) {

    }

    @Override
    public void addGroup(Group group) {

    }

    @Override
    public void addRole(org.apache.catalina.Role role) {

    }

    @Override
    public boolean isInGroup(Group group) {
        return false;
    }

    @Override
    public boolean isInRole(org.apache.catalina.Role role) {
        return false;
    }

    @Override
    public void removeGroup(Group group) {

    }

    @Override
    public void removeGroups() {

    }

    @Override
    public void removeRole(org.apache.catalina.Role role) {

    }

    @Override
    public void removeRoles() {

    }

    @Override
    public String getName() {
        return null;
    }
}
