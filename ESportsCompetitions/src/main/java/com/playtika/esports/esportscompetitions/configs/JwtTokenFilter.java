package com.playtika.esports.esportscompetitions.configs;

import com.playtika.esports.esportscompetitions.exceptions.UnauthorizedUserException;
import com.playtika.esports.esportscompetitions.services.JwtTokenService;
import com.playtika.esports.esportscompetitions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    UserService userService;

    public JwtTokenFilter(JwtTokenService jwtTokenProviderService) {
        this.jwtTokenService = jwtTokenProviderService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) {
//        String token = jwtTokenService.getTokenFromHttpRequest(httpServletRequest);
//        try{
//            if(token != null && jwtTokenService.validateToken(token)){
//                Authentication auth = validateUser(token);
//                SecurityContextHolder.getContext().setAuthentication(auth);
//            }
//        }catch (UnauthorizedUserException e){
//        SecurityContextHolder.clearContext();
//        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
//        return;
//    }
//        filterChain.doFilter(httpServletRequest, httpServletResponse);
//}
//
//    public Authentication validateUser(String token){
//        UserDetails userDetails = userService.loadUserByUsername(jwtTokenService.getUsernameFromToken(token));
//        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }
}