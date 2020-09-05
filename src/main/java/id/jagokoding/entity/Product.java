package id.jagokoding.entity;

import java.math.BigDecimal;

public class Product {

	private Long id;
	private String name;
	private BigDecimal amount;

	public Product() {
	}

	public Product(Long id, String name, BigDecimal amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}
