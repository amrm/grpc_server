package com.daily.technical.knowledge.grpcServer.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import com.daily.technical.knowledge.grpcServer.grpc.ProductService.ProductDetailResponse;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.ProductsResponse;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.productDetailRequest;
import com.daily.technical.knowledge.grpcServer.grpc.ProductService.productsRequest;


public final class productServiceGrpc {

  private productServiceGrpc() {}

  public static final String SERVICE_NAME = "com.daily.technical.knowledge.grpcClient.productService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<productDetailRequest,
      ProductDetailResponse> METHOD_GET_PRODUCT_DETAIL =
      io.grpc.MethodDescriptor.<productDetailRequest, ProductDetailResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.daily.technical.knowledge.grpcClient.productService", "getProductDetail"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              productDetailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductDetailResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<productsRequest,
      ProductsResponse> METHOD_GET_PRODUCTS =
      io.grpc.MethodDescriptor.<productsRequest, ProductsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.daily.technical.knowledge.grpcClient.productService", "getProducts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              productsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ProductsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static productServiceStub newStub(io.grpc.Channel channel) {
    return new productServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static productServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new productServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static productServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new productServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class productServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductDetail(productDetailRequest request,
        io.grpc.stub.StreamObserver<ProductDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_DETAIL, responseObserver);
    }

    /**
     */
    public void getProducts(productsRequest request,
        io.grpc.stub.StreamObserver<ProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PRODUCT_DETAIL,
            asyncUnaryCall(
              new MethodHandlers<
                productDetailRequest,
                ProductDetailResponse>(
                  this, METHODID_GET_PRODUCT_DETAIL)))
          .addMethod(
            METHOD_GET_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                productsRequest,
                ProductsResponse>(
                  this, METHODID_GET_PRODUCTS)))
          .build();
    }
  }

  /**
   */
  public static final class productServiceStub extends io.grpc.stub.AbstractStub<productServiceStub> {
    private productServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductDetail(productDetailRequest request,
        io.grpc.stub.StreamObserver<ProductDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_DETAIL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProducts(productsRequest request,
        io.grpc.stub.StreamObserver<ProductsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class productServiceBlockingStub extends io.grpc.stub.AbstractStub<productServiceBlockingStub> {
    private productServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProductDetailResponse getProductDetail(productDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_DETAIL, getCallOptions(), request);
    }

    /**
     */
    public ProductsResponse getProducts(productsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class productServiceFutureStub extends io.grpc.stub.AbstractStub<productServiceFutureStub> {
    private productServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private productServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected productServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new productServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductDetailResponse> getProductDetail(
        productDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_DETAIL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProductsResponse> getProducts(
        productsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_DETAIL = 0;
  private static final int METHODID_GET_PRODUCTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final productServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(productServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_DETAIL:
          serviceImpl.getProductDetail((productDetailRequest) request,
              (io.grpc.stub.StreamObserver<ProductDetailResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((productsRequest) request,
              (io.grpc.stub.StreamObserver<ProductsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class productServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return getFileDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (productServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new productServiceDescriptorSupplier())
              .addMethod(METHOD_GET_PRODUCT_DETAIL)
              .addMethod(METHOD_GET_PRODUCTS)
              .build();
        }
      }
    }
    return result;
  }
}
