package id.jagokoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import id.jagokoding.service.ProductService;

@Component
public class ProductController {

	private ProductService productService;

//	@Autowired tidak perlu di spring 4.3 + 
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	public void printProducts() {
		productService.getProducts().forEach(product -> {
			System.out.println(product);
		});
	}
}
