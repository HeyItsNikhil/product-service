package com.example.product.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entities.Product;
import com.example.product.entities.services.ProductServices;


@RestController
@RequestMapping(value= "/api/product")
public class ProductLookup {

	@Autowired
	ProductServices prdServices;
	
	org.slf4j.Logger LOG = LoggerFactory.getLogger(ProductLookup.class);
	
	@RequestMapping(value = "/")
	public List<Product> getAllItem() {
		LOG.info( new Date() + " Calling lookupItem");
		List<Product> response = prdServices.getAll();
		return response;
	}
	
	@RequestMapping(value = "/getProductById")
	public Product getItemById(@RequestParam String prdId) {
		LOG.info("Calling lookupItem.");
		Product response = prdServices.getProductById(prdId);
		return response;
	}
}
