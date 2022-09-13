package com.construction.constructionfirm.controller.security;

import com.construction.constructionfirm.entity.KlijentEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {

    private final KlijentEntity klijent;

    public CustomUserDetails(KlijentEntity klijent) {
        this.klijent = klijent;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(klijent.getRole()));
    }

    @Override
    public String getPassword() {
        return klijent.getPassword();
    }

    @Override
    public String getUsername() {
        return klijent.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
