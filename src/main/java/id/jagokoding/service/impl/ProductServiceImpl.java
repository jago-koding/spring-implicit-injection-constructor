package id.jagokoding.service.impl;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import id.jagokoding.entity.Product;
import id.jagokoding.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products;

	public ProductServiceImpl() {
		this.products = Arrays.asList(new Product(1l, "ROTI", new BigDecimal(3000)),
				new Product(2l, "SUSU", new BigDecimal(8000)), new Product(2l, "TISU", new BigDecimal(5000)));
	}

	@Override
	public List<Product> getProducts() {
		return this.products;
	}

}