package com.courses.je.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests -> authorizeRequests
                        // Permitir acceso a login y recursos estaticos
                        .requestMatchers("/login", "/resources/**").permitAll()
                        // Restriccion de acceso por rol
                        .requestMatchers("/editar/**", "/agregar", "/eliminar/**").hasRole("ADMIN")
                        // Acceso a usuarios autenticados
                        .requestMatchers("/").hasAnyRole("USER", "ADMIN")
                        // Cualquier otra solicitud requiere autenticacion
                        .anyRequest().authenticated())
                .formLogin(fromLogin -> fromLogin
                        // Pagina de login personalizada
                        .loginPage("/login")
                        // Redireccion despues de login exitoso
                        .defaultSuccessUrl("/", true)
                        // Permitir acceso al formulario del login
                        .permitAll())
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout"))
                .exceptionHandling(exceptionHandling -> exceptionHandling
                        .accessDeniedPage("/errores/403"));
        return http.build();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder build) throws Exception {
        build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
}
