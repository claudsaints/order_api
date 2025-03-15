package com.claudsaints.spring.config;

import com.claudsaints.spring.entities.Category;
import com.claudsaints.spring.entities.Order;
import com.claudsaints.spring.entities.Product;
import com.claudsaints.spring.entities.User;
import com.claudsaints.spring.entities.enums.OrderStatus;
import com.claudsaints.spring.repositories.CategoryRepository;
import com.claudsaints.spring.repositories.OrderRepository;
import com.claudsaints.spring.repositories.ProductRepository;
import com.claudsaints.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestClass implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category c1 = new Category(null,"Foods");
        Category c2 = new Category(null,"Toys");
        Category c3 = new Category(null,"Books");

        User u1 = new User(null,"Nibiro","nibiro@gmail.com","129099090","123456");
        User u2 = new User(null,"Pedro","pedro@gmail.com","3432942343","123456");

        Order o1 = new Order(null, Instant.parse("2025-03-03T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2025-03-12T12:53:07Z"), OrderStatus.WAITTING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2025-03-11T02:53:07Z"),OrderStatus.WAITTING_PAYMENT, u1);

        Product p1 = new Product(null,"Lord of Flies","Funny book",25.00,"");
        Product p2 = new Product(null,"1984","Hard book",25.00,"");
        Product p3 = new Product(null,"Cake","Chocolate cake",5.00,"");



        categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3));

        p1.getCategories().add(c3);
        p2.getCategories().add(c3);
        p3.getCategories().add(c1);

        productRepository.saveAll(Arrays.asList(p1,p2,p3));

    }
}
