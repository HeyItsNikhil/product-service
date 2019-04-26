package com.example.product.entities.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entities.Product;
import com.example.product.entities.dao.ProductRepository;

@Service
public class ProductServices {

org.slf4j.Logger LOG = LoggerFactory.getLogger(Product.class);
	
	@Autowired
	ProductRepository prdRepository;
	
	public Product getProductById(String id) {
		Product response = new Product();
		try {
			Optional<Product> optItem = prdRepository.findById(Long.valueOf(id));
			response = optItem.get();
			LOG.info(new Date() + " Returning Item: " + id);
		}catch(Exception e) {
			LOG.error(new Date() + " No Item Found With id : " + id);
		}
		return response;
	}
	
	public List<Product> getAll(){
		List<Product> response = new ArrayList<Product>();
		try {
			response = (List<Product>) prdRepository.findAll();
			response.forEach(p -> LOG.info(new Date() +" "+  p.toString()));
		}
		catch(Exception e) {
			LOG.error(new Date() +" Facing Some Problem While Fetching the List Please Try After Some Time");
		}
		return response;
	}
}
