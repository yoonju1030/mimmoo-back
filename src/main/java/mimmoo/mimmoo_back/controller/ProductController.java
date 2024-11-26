package mimmoo.mimmoo_back.controller;

import mimmoo.mimmoo_back.domain.Product;
import mimmoo.mimmoo_back.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/save")
    @ResponseBody
    public Product save(@RequestParam("name") String name) {
        Product product = new Product();
        product.setName(name);
        Product savedProduct = productService.save(product);
        return savedProduct;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Product> findAllProduct() {
        List<Product> products = productService.findAll();
        return products;
    }
}
