package com.nila.book.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.nila.book.configurations.security.CustomAuthenticationFailureHandler;
import com.nila.book.configurations.security.CustomAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations extends WebSecurityConfigurerAdapter
{

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.inMemoryAuthentication().passwordEncoder(encoder()).withUser("admin").password(encoder().encode("admin")).roles("ADMIN").and().withUser("usr").password(encoder().encode("usr")).roles("USER").and().withUser("test").password(encoder().encode("te")).roles("");
    }

    @Override
    public void configure(HttpSecurity security) throws Exception
    {
        security.authorizeRequests().antMatchers("/resources/**").permitAll();
        security.authorizeRequests().antMatchers("/login").permitAll();
        security.authorizeRequests().antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')").antMatchers("/user/**").access("hasRole('ROLE_USER')").and().formLogin().loginPage("/login").defaultSuccessUrl("/admin/").successHandler(this.authSuccessHandler()).failureHandler(this.authFailureHandler()).permitAll().and().logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout=successfully logged out").and().csrf().disable();
        security.authorizeRequests().antMatchers("/**").permitAll();
        security.headers().frameOptions().disable();

    }

    public BCryptPasswordEncoder encoder()
    {
        return new BCryptPasswordEncoder(10);
    }

    public AuthenticationSuccessHandler authSuccessHandler()
    {
        return new CustomAuthenticationSuccessHandler();
    }

    public AuthenticationFailureHandler authFailureHandler()
    {
        return new CustomAuthenticationFailureHandler();
    }

}
