package org.shop.configuration;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class DataInitializerConfiguration {
    @Bean
    public DataInitializer dataInitializer(){
        return new DataInitializer();
    }

    @Autowired
    private ProductService productService;
    @Bean
    public ProductInitializer productInitializer() {
        return new ProductInitializer(productService);
    }

    @Bean("proposalInitializer")
    public ProposalInitializer proposalInitializer(){
        return new ProposalInitializer();
    }

    @Bean
    public SellerInitializer sellerInitializer(){
        return new SellerInitializer();
    }

    @Autowired
    private UserService userService;
    @Bean
    public UserInitializer userInitializer(){
        return new UserInitializer(userService);
    }

}
