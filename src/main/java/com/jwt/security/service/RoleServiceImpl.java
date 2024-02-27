package com.jwt.security.service;

import com.jwt.security.entity.ERole;
import com.jwt.security.entity.Role;
import com.jwt.security.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RoleServiceImpl {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void initRoles(){
        List<String> roleList = Arrays.asList("ROLE_USER","ROLE_MODERATOR","ROLE_ADMIN");
        for(String s: roleList){
            Role r = new Role();
            r.setName(ERole.valueOf(s));
            roleRepository.save(r);
        }
    }

    public Long countDataInRoles(){
        return roleRepository.count();
    }

    public void deleteAllData(){
        roleRepository.deleteAll();
    }

}
