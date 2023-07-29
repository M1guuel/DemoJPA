package com.br.aula.aula02.entities;

import java.io.Serializable;
import java.util.Objects;

import com.br.aula.aula02.entities.pk.OrderItemPK;
import com.br.aula.aula02.entities.resource.OrdemItemResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();

	private Double price;
	private Integer quantity;

	public OrderItem() {
	}
	
	public OrderItem(Order order, Product product,Integer quantity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.price = price;
		this.quantity = quantity;
	}

@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		id.setOrder(order);
	}

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}

}
