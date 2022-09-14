package com.construction.constructionfirm.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http

                .authorizeRequests()
                .antMatchers("/", "/register", "/termin1" ,"/saveUser", "/css/**", "/js/**", "/img/**", "/images/**", "/zahtjeviForm", "/saveZahtjevForm")
                .permitAll()
                .and()

                .authorizeRequests()
                .antMatchers("/addZahtjev", "/saveJobZahtjev").hasAuthority("USER")
                .antMatchers("/admin", "/viewZahtjevi").hasAuthority("Admin")
                .and()

                .logout()
                .permitAll()
                .and()

                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()

                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .rememberMe()
                .and()

                .logout()
                .permitAll()
                .and()

                .httpBasic()
                .and()
                .csrf().disable();
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
