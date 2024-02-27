package com.jwt.security.initData;

import com.jwt.security.service.RoleServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitialisation {

    private final RoleServiceImpl roleService;

    public DataInitialisation(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @PostConstruct
    private void initData(){
        if(roleService.countDataInRoles() != 3) {
            roleService.deleteAllData();
            roleService.initRoles();
        }
    }

}
