package com.example.authserver;

import com.example.authserver.filters.ClientIdFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthserverApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<ClientIdFilter> filterRegistrationBean() {
		FilterRegistrationBean<ClientIdFilter> registrationBean = new FilterRegistrationBean<>();
		ClientIdFilter clientIdFilter = new ClientIdFilter();
		registrationBean.setFilter(clientIdFilter);
		registrationBean.addUrlPatterns("/api/categories/*");
		return registrationBean;
	}
}
