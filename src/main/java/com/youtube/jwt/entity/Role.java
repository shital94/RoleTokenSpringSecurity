//1. Role class and annotation with getter and setter

package com.youtube.jwt.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//The entities are the persistence objects stores as a record in the database
public class Role {

    //create data properties
    @Id
    //The @Id annotation in Spring Boot is used to specify the primary key of an entity.
    private String roleName;
    private String roleDescription;

    /*
    create getter and setter
    getter and setter is use to hide code od data members from unauthorised user.
    it allow validation and debugging after done the coding easily.
    */

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
