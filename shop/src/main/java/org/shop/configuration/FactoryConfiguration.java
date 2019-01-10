package org.shop.configuration;

import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "org.shop")
@Import({ServiceConfiguration.class,
DataInitializerConfiguration.class})
public class FactoryConfiguration {
    @Bean
    public UserRepositoryFactory userRepositoryFactory(){
        return new UserRepositoryFactory();
    }


}