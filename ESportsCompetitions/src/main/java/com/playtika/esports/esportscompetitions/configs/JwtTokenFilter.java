package com.playtika.esports.esportscompetitions.configs;

import com.playtika.esports.esportscompetitions.services.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    private JwtTokenService jwtTokenService;

    public JwtTokenFilter(JwtTokenService jwtTokenProviderService) {
        this.jwtTokenService = jwtTokenProviderService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

    }
}
