package com.daily.technical.knowledge.grpcServer.service;

import java.util.List;

import com.daily.technical.knowledge.grpcServer.model.Product;

/**
 * 
 * @author Amr Abdeldayem
 *
 */

public interface ProductService {
	Product getProductDetail(Integer id) ;
	List<Product> getProducts() ;
}
