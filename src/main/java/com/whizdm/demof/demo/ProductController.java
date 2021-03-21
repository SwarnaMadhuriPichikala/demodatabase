package com.whizdm.demof.demo;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    public ProductService productService;

    public ProductController(ProductService ps){
        this.productService = ps;
    }
    @GetMapping("/status")
    String hello(){
        return "HEllo, World!";
    }
    @PostMapping("/register")
    Products register(@RequestBody Products newUser){
        return productService.register(newUser);
    }
}