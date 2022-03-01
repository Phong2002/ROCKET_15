package com.vti.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Service
public class JWTToken {

    @Autowired
    private UserService userService;

    private static final long EXPIRATION_TIME = 864000000; // 10 days
    private static final String SECRET = "ahihi";
    private static final String PREFIX_TOKEN = "Bearer";
    private static final String AUTHORIZATION = "Authorization";

    public void addJWTTokenAndUserInfoToBody(HttpServletResponse response, String username) throws IOException {
        String JWT = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(
                "{\"" + AUTHORIZATION+"\":\""+ PREFIX_TOKEN + " " + JWT+ "\"}"
        );

    }

    public Authentication parseTokenToUserInformation(HttpServletRequest request) {
        String token = request.getHeader(AUTHORIZATION);
        if (token == null) {
            return null;
        }

        // parse the token
        String username = Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token.replace(PREFIX_TOKEN, ""))
                .getBody()
                .getSubject();

        String role = userService.getUserUserName(username).getRole();
        return username != null ?
                new UsernamePasswordAuthenticationToken(username, null, AuthorityUtils.createAuthorityList(role)) :
                null;
    }
}