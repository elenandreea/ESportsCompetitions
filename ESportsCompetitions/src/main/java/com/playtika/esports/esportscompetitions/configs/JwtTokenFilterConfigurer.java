package com.playtika.esports.esportscompetitions.configs;


import com.playtika.esports.esportscompetitions.services.JwtTokenService;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtTokenFilterConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    private JwtTokenService jwtTokenService;

    public JwtTokenFilterConfigurer(JwtTokenService jwtTokenService) {
        this.jwtTokenService = jwtTokenService;
    }

    //ne facem filtrul custom si il adaugam inainte de autentificare
    @Override
    public void configure(HttpSecurity http) throws Exception {
        JwtTokenFilter customFilter = new JwtTokenFilter(jwtTokenService);
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }

}
