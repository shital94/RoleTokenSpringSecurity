//2. define the roles and its controllers

package com.youtube.jwt.controller;

import com.youtube.jwt.entity.Role;
import com.youtube.jwt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    //The @Autowired annotation is used to automatically inject the dependencies of a Spring bean. It is used in conjunction with the Spring Framework's dependency injection feature.
    private RoleService roleService;

    // HTTP POST requests onto specific handler methods using @postMapping annotation
    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role){
        return roleService.createNewRole(role);
    }
}
