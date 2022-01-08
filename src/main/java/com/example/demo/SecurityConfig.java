package com.example.demo;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure (HttpSecurity http) throws Exception{
		http
				
				.authorizeRequests().antMatchers("/")
				.permitAll()
				.and()
				.authorizeRequests().antMatchers("/h2-console/**")
				.permitAll()
				.anyRequest().authenticated();
		http.formLogin().loginPage("/login").permitAll();
		http.logout().permitAll();
		http.csrf().disable();
		http.headers().frameOptions().disable();
				
	}
	

}
