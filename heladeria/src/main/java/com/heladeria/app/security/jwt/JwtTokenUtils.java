package com.heladeria.app.security.jwt;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

// STEP 25 Clase que generará el token JWT y también servirá para verificar
public class JwtTokenUtils {

	private final static String ACCESS_TOKE_SECRET = "palabrasecreta_crR/lggroR-o6?qFOpAuTTRkt!aGW49wsys5mwkJP9YnLNVPuuJ2Z!jXiJGGzULqmIgWltkfcYQD/twTzCo/zb/wt=jVP/2NjFd2aVc!uKpdNiDB48-lNFRNTZ7i2L36ZCEhUWUDYtkGjG3BDZcA5SSJzRYClKvAZjLGGUx5MW8ZZUj7iSVv!3eA4BcayMr6IdjxPZqIU7h0?JcsI3mohEFlFHb2MCRJRvNDsey3mHMbcQfH5ChVz!FzJjIlMsVY";
	private final static long ACCESS_TOKEN_VALIDITY_SECONDS = 300; // 5 minutos
	
	// STEP 26 Crear el JWT
	public static String createToken(String email,  Collection<? extends GrantedAuthority> authorities ) {
		
		long expirationTime = ACCESS_TOKEN_VALIDITY_SECONDS * 1000;
		Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);
		
		Map<String, Object> extra = new HashMap<>();
		extra.put("email", email);
		extra.put("roles", authorities);
		
		return Jwts.builder()
				.setSubject(email) // identificar al propietario del token
				.setExpiration(expirationDate)
				.setClaims(extra)
				.signWith( Keys.hmacShaKeyFor(ACCESS_TOKE_SECRET.getBytes()  )  )
				.compact();				
	}
	
	
}

