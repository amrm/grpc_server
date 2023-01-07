package com.daily.technical.knowledge.grpcServer.service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.lognet.springboot.grpc.GRpcService;

import com.daily.technical.knowledge.grpcServer.model.NullProduct;
import com.daily.technical.knowledge.grpcServer.model.Product;
/**
 * 
 * @author Amr Abdeldayem
 *
 */

@GRpcService
public class ProductServiceImpl implements ProductService{

	static Map<Integer, Product> productMap=new HashMap<>();
	
	{
		initalizeProductMap();
	}
	
	static void initalizeProductMap() {
		productMap.clear();
		for(int i=1 ;i<1000;i++) {
			productMap.put(i, generateDummayProduct(i));
		}
		
	}
	
	public Product getProductDetail(Integer id) {
		
		if(productMap.get(id) ==null)
			return new NullProduct();
		return productMap.get(id);
	}
	
	static Product generateDummayProduct(int id) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, id);  
		
		Product product =new Product(id, "Product "+ id, " Category "+ id, c.getTime(), "Desc " + id, 10.00 *id , 11.00 *id ,1 * id );
		
		return product;
	}
	
	public List<Product> getProducts() {		
		return productMap.values().stream().limit(1000).collect(Collectors.toList());
	}
}
