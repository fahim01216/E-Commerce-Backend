//package com.ecommerce.config;
//
////import org.springframework.context.annotation.Bean;
////import com.okta.spring.boot.oauth.Okta;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////
////        // protect endpoint /api/orders
////        http.authorizeHttpRequests()
////                .antMatchers("/api/orders/**")
////                .authenticated()
////                .and()
////                .oauth2ResourceServer()
////                .jwt();
////
////        // add cors filter
////        http.cors();
////
////        // force a non-empty response body for 401's to make the response more friendly
////        Okta.configureResourceServer401ResponseBody(http);
////
////        // disable CSFR since we are not using cookies for session tracking
////        http.csrf().disable();
////    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        // protect endpoint /api/orders
//        http.authorizeHttpRequests()
//                .antMatchers("/api/orders/**")
//                .authenticated()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
//
//        // add cors filter
//        http.cors();
//
//        // force a non-empty response body for 401's to make the response more friendly
//        //Okta.configureResourceServer401ResponseBody(http);
//
//        // disable CSFR since we are not using cookies for session tracking
//        //http.csrf().disable();
//
//        return http.build();
//    }
//}
