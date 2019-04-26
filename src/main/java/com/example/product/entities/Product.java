package com.example.product.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2587684166989725627L;

	@Id
	@GeneratedValue
	Long id;
	
	String prodName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + "]";
	}
	
}
