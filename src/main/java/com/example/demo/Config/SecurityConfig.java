package com.example.demo.Config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	 
	
	@Override
	protected void configure (HttpSecurity http) throws Exception{
		http
				/***
				.authorizeRequests().antMatchers("/", "/index")
				.permitAll()
				.and()*/
				.authorizeRequests().antMatchers("/h2-console/**")
				.permitAll()
				.anyRequest().authenticated();
		http.formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll();
		http.logout().permitAll();
		http.csrf().disable();
		http.headers().frameOptions().disable();
				
	}
	
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("password")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
	
	/***
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
    
        //default schema to create users
        auth.jdbcAuthentication()
        .dataSource(dataSource)
        .withDefaultSchema()
        .withUser(
                User.withUsername("user")
                .password("password")
                .roles("USER")
        )
        .withUser(
                User.withUsername("admin")
                .password("password")
                .roles("ADMIN")
        );        
    }
    ****/

}
