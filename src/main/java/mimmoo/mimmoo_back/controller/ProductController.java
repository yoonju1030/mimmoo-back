package mimmoo.mimmoo_back.controller;

import mimmoo.mimmoo_back.domain.Image;
import mimmoo.mimmoo_back.domain.Product;
import mimmoo.mimmoo_back.service.ImageService;
import mimmoo.mimmoo_back.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;
    private final ImageService imageService;

    @Autowired
    public ProductController(
            ProductService productService,
            ImageService imageService
    ) {
        this.productService = productService;
        this.imageService = imageService;
    }

    @GetMapping("/save")
    @ResponseBody
    public Product save(
            @RequestParam("name") String name,
            @RequestParam("price") Integer price,
            @RequestParam("type") String type
    ) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setType(type);
        Product savedProduct = productService.save(product);
        return savedProduct;
    }

    @PostMapping("/saveImage")
    @ResponseBody
    public Image save(@RequestBody() Image bodyImage) {
        Image image = new Image();
        image.setProductId(bodyImage.getProductId());
        image.setPath(bodyImage.getPath());
        Image savedImage = imageService.save(image);
        return savedImage;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Product> findAllProduct() {
        List<Product> products = productService.findAll();
        return products;
    }
}
