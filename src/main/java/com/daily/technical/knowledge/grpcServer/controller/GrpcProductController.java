package com.daily.technical.knowledge.grpcServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daily.technical.knowledge.grpcServer.model.Product;
import com.daily.technical.knowledge.grpcServer.service.ProductService;

/**
 * 
 * @author Amr Abdeldayem
 *
 */
@RestController("GrpcProduct")
@RequestMapping("/server/grpc/product")
public class GrpcProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/{id}")
	public Product getProductDetail(@PathVariable Integer id) {
		return productService.getProductDetail(id);
	}
	
	@GetMapping("")
	public List<Product> getProducts() {
		return productService.getProducts();
	}
}
