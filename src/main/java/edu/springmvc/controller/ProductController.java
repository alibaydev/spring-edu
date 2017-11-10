package edu.springmvc.controller;

import edu.springmvc.dao.ProductDAO;
import edu.springmvc.domain.Product;
import edu.springmvc.service.ProductService;
import microsoft.exchange.webservices.data.core.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author ibraim
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ExchangeService exchangeService;

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getAllProducts() {
        return productDAO.getProducts();
    }

    @GetMapping("/products/{id}")
    private String getUser(@PathVariable Long id, Model model) {

        return productDAO.getProduct(id)
                .map(product -> {
                    model.addAttribute("product", exchangeService.getUrl().toString());
                    return "product/list";
                }).orElseThrow(RuntimeException::new);
    }
}
