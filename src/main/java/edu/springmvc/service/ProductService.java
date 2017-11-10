package edu.springmvc.service;

import edu.springmvc.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ibraim
 */
@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;
}
