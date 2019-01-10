package org.shop.configuration;

import org.shop.repository.*;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Import(FactoryConfiguration.class)
@PropertySource("classpath:prop.properties")
public class RepositoryConfiguration {
    @Autowired
    private Environment environment;
    @Autowired
    private UserRepositoryFactory userRepositoryFactory;
    @Bean
    public ItemRepository itemRepository() {
        return new ItemMapRepository();
    }

    @Bean
    public OrderRepository orderRepository() {
        OrderMapRepository orderMapRepository = new OrderMapRepository();
        orderMapRepository.setSequence(Long.parseLong(environment.getProperty("intitialSequence")));
        return orderMapRepository;
    }

    @Bean
    public ProductRepository productRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository proposalRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository sellerRepository() {
        return new SellerMapRepository();
    }

    @Bean
    public UserRepository userRepository() {
        return userRepositoryFactory.createUserRepository();
    }
}