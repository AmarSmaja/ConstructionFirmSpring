package com.construction.constructionfirm.controller.security;

import com.construction.constructionfirm.entity.KlijentEntity;
import com.construction.constructionfirm.repos.KlijentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private KlijentRepo klijentRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Ovdje
        KlijentEntity klijent = klijentRepo.findByUsername(username);
        if(klijent == null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        CustomUserDetails customUserDetails = new CustomUserDetails(klijent);
        return customUserDetails;
    }
}
