package id.jagokoding;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import id.jagokoding.controller.ProductController;

@Configuration
@ComponentScan(basePackages = {"id.jagokoding"})
public class App {
	
    public static void main(String[] strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ProductController productController = context.getBean(ProductController.class);
        productController.printProducts();
    }
}