package org.shop.configuration;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.shop.common.Sellers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class DataInitializerConfiguration {
    @Bean(initMethod = "initData")
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

    @Bean
    public Map<Long, String> sellerNames() {
        Map<Long, String> sellerNames = new HashMap<>();
        sellerNames.put(1L, Sellers.AMAZON);
        sellerNames.put(2L, Sellers.SAMSUNG);
        return sellerNames;
    }
    }


