package org.shop;

import org.shop.api.ProductService;
import org.shop.configuration.DataInitializerConfiguration;
import org.shop.configuration.FactoryConfiguration;
import org.shop.configuration.RepositoryConfiguration;
import org.shop.configuration.ServiceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        //TODO: implement using Spring Framework ApplicationContext
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                FactoryConfiguration.class);
        System.out.println(ctx.getBean(FactoryConfiguration.class));
    }
}
