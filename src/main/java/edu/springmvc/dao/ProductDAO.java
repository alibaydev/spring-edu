package edu.springmvc.dao;

import edu.springmvc.domain.Product;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author ibraim
 */
@Repository
public class ProductDAO {

    private List<Product> products = Arrays.asList(
            new Product(1L, "My Product", ZonedDateTime.now()),
            new Product(2L, "Your Product", ZonedDateTime.now()));

    public List<Product> getProducts() {
        return products;
    }

    public Optional<Product> getProduct(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
