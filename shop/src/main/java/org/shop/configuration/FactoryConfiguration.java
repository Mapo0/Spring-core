package org.shop.configuration;

import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.shop")
public class FactoryConfiguration {
    @Bean
    public UserRepositoryFactory userRepositoryFactory(){
        return new UserRepositoryFactory();
    }
}