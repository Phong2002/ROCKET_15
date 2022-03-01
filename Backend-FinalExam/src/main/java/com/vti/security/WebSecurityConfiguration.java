package com.vti.security;

import com.vti.service.IUserService;
import com.vti.service.JWTToken;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private final IUserService service;
	private final JWTToken jwtToken;

	public WebSecurityConfiguration(IUserService service, JWTToken jwtToken) {
		this.service = service;
		this.jwtToken = jwtToken;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(service).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.cors()
			.and()
			.authorizeRequests()
				.antMatchers("/api/v1/login").permitAll()
				.antMatchers("/api/v1/users").permitAll()
				.antMatchers("/api/v1/users/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/v1/groups").hasAnyAuthority("Manager")
				.antMatchers(HttpMethod.DELETE, "/api/v1/groups/*").hasAnyAuthority("Manager")
				.antMatchers(HttpMethod.PUT, "/api/v1/groups/*").hasAnyAuthority("Manager")
				.antMatchers(HttpMethod.POST, "/api/v1/groups").hasAnyAuthority("Manager")
				.anyRequest().authenticated()
			.and()
			.httpBasic()
			.and()
			.csrf().disable()
				.addFilterBefore(
						new JWTAuthenticationFilter( authenticationManager(),service,jwtToken),
						UsernamePasswordAuthenticationFilter.class)
				.addFilterBefore(
						new JWTAuthorizationFilter(jwtToken),
						UsernamePasswordAuthenticationFilter.class);
	}

//	@Bean
//	public CorsConfigurationSource corsConfigurationSource() {
//		final CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedMethods(ImmutableList.of("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
//		configuration.applyPermitDefaultValues();
//
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		return source;
//	}

}

