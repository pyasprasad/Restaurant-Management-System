package com.geekster.RestaurentManagementSystem.controllers;

import com.geekster.RestaurentManagementSystem.models.Role;
import com.geekster.RestaurentManagementSystem.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping("/{email}")
    public String addRole( @PathVariable String email , @RequestBody Role role){

        return roleService.addRole(role , email);
    }
}
