package web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/", "/profile").denyAll()
            .anyRequest().authenticated()
        .and()
            .formLogin()
            .loginPage("/login")
            .failureHandler((httpServletRequest, httpServletResponse, e) -> {
                System.out.println("Error");
            })
            .successHandler((httpServletRequest, httpServletResponse, e) -> {
                System.out.println("Success");
            })
            .permitAll()
        .and()
            .logout()
            .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .withUser("user").password("password").roles("USER");
    }
}