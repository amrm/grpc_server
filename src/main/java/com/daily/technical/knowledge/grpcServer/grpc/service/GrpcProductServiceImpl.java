package com.daily.technical.knowledge.grpcServer.grpc.service;

import java.util.ArrayList;
import java.util.List;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.technical.knowledge.grpcServer.grpc.ProductService;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.Product.Builder;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.ProductDetailResponse;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.ProductsResponse;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.productDetailRequest;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.productsRequest;
import com.daily.technical.knowledge.grpcServer.grpc.productServiceGrpc.productServiceImplBase;
import com.daily.technical.knowledge.grpcServer.model.Product;


/**
 * 
 * @author Amr Abdeldayem
 *
 */

@GRpcService
public class GrpcProductServiceImpl extends productServiceImplBase {
	
	@Autowired
	com.daily.technical.knowledge.grpcServer.service.ProductService productService;
	
	public void getProductDetail(productDetailRequest request,
	        io.grpc.stub.StreamObserver<ProductDetailResponse> responseObserver) {
	      
		Product product=productService.getProductDetail(request.getId());
				
		
		ProductService.Product grpcProduct =getGrpcProduct(product);
		
		
		ProductDetailResponse response =ProductDetailResponse.newBuilder().setProduct(grpcProduct).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	    }

	    /**
	     */
	    public void getProducts(productsRequest request,
	        io.grpc.stub.StreamObserver<ProductsResponse> responseObserver) {
	      
	    	List<Product> products=productService.getProducts();
			
	    	
			
			List<ProductService.Product> grpcProducts=new ArrayList<>();
			
			
			for(int i=0; i<products.size();i++) {
				grpcProducts.add(getGrpcProduct(products.get(i)));
			}
			
			ProductsResponse response =ProductsResponse.newBuilder().addAllProducts(grpcProducts).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
	    }
	    
	    private ProductService.Product getGrpcProduct(Product product) {
	    	ProductService.Product grpcProduct = ProductService.Product.newBuilder().setName(product.getName()).setId(product.getId()).setCategory(product.getCategory())
					.setCost(product.getCost()).setCount(product.getCount()).setDescription(product.getDescription()).setPrice(product.getPrice()).build();
	    	return grpcProduct;		
	    }
}
