package it.lamiapizzeria.security;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.DelegatingSecurityContextRepository;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.RequestAttributeSecurityContextRepository;

import static org.springframework.http.HttpMethod.GET;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http.authorizeHttpRequests()
                .requestMatchers(GET, "/index/administration/**").hasAuthority("USER")
            //    .requestMatchers("/index/formSpecialPrice/**").hasAuthority("ADMIN")
            //    .requestMatchers("/index/form/**").hasAnyAuthority("ADMIN","USER")


                .anyRequest().permitAll()
                .and().formLogin()
                .and().logout();
//        http
//            .authorizeHttpRequests((authorize) -> authorize
//                    .dispatcherTypeMatchers(DispatcherType.FORWARD, DispatcherType.ERROR).permitAll()
//                    .requestMatchers("/index/administration/**").hasAuthority("USER")
//                    //.requestMatchers("/index/administration").hasAuthority("ADMIN")
//                    //.requestMatchers("/index/formSpecialPrice").hasAuthority("ADMIN")
//                    .anyRequest().permitAll()
//            )
//            .csrf(csrf -> csrf
//                    .ignoringRequestMatchers("/index/administration/**")
//                    .disable()
//            )
//            //.httpBasic(Customizer.withDefaults())
//            .securityContext((securityContext) -> securityContext
//                    .securityContextRepository(new DelegatingSecurityContextRepository(
//                            new RequestAttributeSecurityContextRepository(),
//                            new HttpSessionSecurityContextRepository()
//                    ))
//            )
//            .sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//            .formLogin(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    DatabaseUserDetailsService userDetailsService() {
        return new DatabaseUserDetailsService();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    AuthenticationManager authenticationManager(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
        DaoAuthenticationProvider authenticationProvider = authenticationProvider();

        ProviderManager providerManager = new ProviderManager(authenticationProvider);
        providerManager.setEraseCredentialsAfterAuthentication(false);

        return providerManager;
    }
}
