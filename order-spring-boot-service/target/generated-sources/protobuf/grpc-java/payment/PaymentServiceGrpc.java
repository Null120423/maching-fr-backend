package payment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * === PaymentService chính ===
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: payment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "payment.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<payment.CreateTransactionRequest,
      payment.CreateTransactionResponse> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = payment.CreateTransactionRequest.class,
      responseType = payment.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payment.CreateTransactionRequest,
      payment.CreateTransactionResponse> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<payment.CreateTransactionRequest, payment.CreateTransactionResponse> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = PaymentServiceGrpc.getCreateTransactionMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getCreateTransactionMethod = PaymentServiceGrpc.getCreateTransactionMethod) == null) {
          PaymentServiceGrpc.getCreateTransactionMethod = getCreateTransactionMethod =
              io.grpc.MethodDescriptor.<payment.CreateTransactionRequest, payment.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.CreateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("CreateTransaction"))
              .build();
        }
      }
    }
    return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<payment.GenerateQRRequest,
      payment.GenerateQRResponse> getGenerateQRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateQR",
      requestType = payment.GenerateQRRequest.class,
      responseType = payment.GenerateQRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payment.GenerateQRRequest,
      payment.GenerateQRResponse> getGenerateQRMethod() {
    io.grpc.MethodDescriptor<payment.GenerateQRRequest, payment.GenerateQRResponse> getGenerateQRMethod;
    if ((getGenerateQRMethod = PaymentServiceGrpc.getGenerateQRMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getGenerateQRMethod = PaymentServiceGrpc.getGenerateQRMethod) == null) {
          PaymentServiceGrpc.getGenerateQRMethod = getGenerateQRMethod =
              io.grpc.MethodDescriptor.<payment.GenerateQRRequest, payment.GenerateQRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateQR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.GenerateQRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.GenerateQRResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("GenerateQR"))
              .build();
        }
      }
    }
    return getGenerateQRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<payment.PaymentCallbackRequest,
      payment.PaymentCallbackResponse> getHandlePaymentCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandlePaymentCallback",
      requestType = payment.PaymentCallbackRequest.class,
      responseType = payment.PaymentCallbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payment.PaymentCallbackRequest,
      payment.PaymentCallbackResponse> getHandlePaymentCallbackMethod() {
    io.grpc.MethodDescriptor<payment.PaymentCallbackRequest, payment.PaymentCallbackResponse> getHandlePaymentCallbackMethod;
    if ((getHandlePaymentCallbackMethod = PaymentServiceGrpc.getHandlePaymentCallbackMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getHandlePaymentCallbackMethod = PaymentServiceGrpc.getHandlePaymentCallbackMethod) == null) {
          PaymentServiceGrpc.getHandlePaymentCallbackMethod = getHandlePaymentCallbackMethod =
              io.grpc.MethodDescriptor.<payment.PaymentCallbackRequest, payment.PaymentCallbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandlePaymentCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.PaymentCallbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.PaymentCallbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("HandlePaymentCallback"))
              .build();
        }
      }
    }
    return getHandlePaymentCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<payment.CheckTransactionRequest,
      payment.CheckTransactionResponse> getCheckTransactionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTransactionStatus",
      requestType = payment.CheckTransactionRequest.class,
      responseType = payment.CheckTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payment.CheckTransactionRequest,
      payment.CheckTransactionResponse> getCheckTransactionStatusMethod() {
    io.grpc.MethodDescriptor<payment.CheckTransactionRequest, payment.CheckTransactionResponse> getCheckTransactionStatusMethod;
    if ((getCheckTransactionStatusMethod = PaymentServiceGrpc.getCheckTransactionStatusMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getCheckTransactionStatusMethod = PaymentServiceGrpc.getCheckTransactionStatusMethod) == null) {
          PaymentServiceGrpc.getCheckTransactionStatusMethod = getCheckTransactionStatusMethod =
              io.grpc.MethodDescriptor.<payment.CheckTransactionRequest, payment.CheckTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckTransactionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.CheckTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payment.CheckTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("CheckTransactionStatus"))
              .build();
        }
      }
    }
    return getCheckTransactionStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * === PaymentService chính ===
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Tạo giao dịch mới (transaction)
     * </pre>
     */
    default void createTransaction(payment.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<payment.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sinh mã QR thanh toán
     * </pre>
     */
    default void generateQR(payment.GenerateQRRequest request,
        io.grpc.stub.StreamObserver<payment.GenerateQRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateQRMethod(), responseObserver);
    }

    /**
     * <pre>
     * Hook lắng nghe callback từ ví/SEPay
     * </pre>
     */
    default void handlePaymentCallback(payment.PaymentCallbackRequest request,
        io.grpc.stub.StreamObserver<payment.PaymentCallbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandlePaymentCallbackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Kiểm tra trạng thái giao dịch
     * </pre>
     */
    default void checkTransactionStatus(payment.CheckTransactionRequest request,
        io.grpc.stub.StreamObserver<payment.CheckTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckTransactionStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PaymentService.
   * <pre>
   * === PaymentService chính ===
   * </pre>
   */
  public static abstract class PaymentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PaymentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PaymentService.
   * <pre>
   * === PaymentService chính ===
   * </pre>
   */
  public static final class PaymentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Tạo giao dịch mới (transaction)
     * </pre>
     */
    public void createTransaction(payment.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<payment.CreateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sinh mã QR thanh toán
     * </pre>
     */
    public void generateQR(payment.GenerateQRRequest request,
        io.grpc.stub.StreamObserver<payment.GenerateQRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Hook lắng nghe callback từ ví/SEPay
     * </pre>
     */
    public void handlePaymentCallback(payment.PaymentCallbackRequest request,
        io.grpc.stub.StreamObserver<payment.PaymentCallbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandlePaymentCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Kiểm tra trạng thái giao dịch
     * </pre>
     */
    public void checkTransactionStatus(payment.CheckTransactionRequest request,
        io.grpc.stub.StreamObserver<payment.CheckTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckTransactionStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PaymentService.
   * <pre>
   * === PaymentService chính ===
   * </pre>
   */
  public static final class PaymentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Tạo giao dịch mới (transaction)
     * </pre>
     */
    public payment.CreateTransactionResponse createTransaction(payment.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sinh mã QR thanh toán
     * </pre>
     */
    public payment.GenerateQRResponse generateQR(payment.GenerateQRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateQRMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Hook lắng nghe callback từ ví/SEPay
     * </pre>
     */
    public payment.PaymentCallbackResponse handlePaymentCallback(payment.PaymentCallbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandlePaymentCallbackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Kiểm tra trạng thái giao dịch
     * </pre>
     */
    public payment.CheckTransactionResponse checkTransactionStatus(payment.CheckTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckTransactionStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PaymentService.
   * <pre>
   * === PaymentService chính ===
   * </pre>
   */
  public static final class PaymentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Tạo giao dịch mới (transaction)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payment.CreateTransactionResponse> createTransaction(
        payment.CreateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sinh mã QR thanh toán
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payment.GenerateQRResponse> generateQR(
        payment.GenerateQRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateQRMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Hook lắng nghe callback từ ví/SEPay
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payment.PaymentCallbackResponse> handlePaymentCallback(
        payment.PaymentCallbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandlePaymentCallbackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Kiểm tra trạng thái giao dịch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payment.CheckTransactionResponse> checkTransactionStatus(
        payment.CheckTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckTransactionStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRANSACTION = 0;
  private static final int METHODID_GENERATE_QR = 1;
  private static final int METHODID_HANDLE_PAYMENT_CALLBACK = 2;
  private static final int METHODID_CHECK_TRANSACTION_STATUS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((payment.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<payment.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_GENERATE_QR:
          serviceImpl.generateQR((payment.GenerateQRRequest) request,
              (io.grpc.stub.StreamObserver<payment.GenerateQRResponse>) responseObserver);
          break;
        case METHODID_HANDLE_PAYMENT_CALLBACK:
          serviceImpl.handlePaymentCallback((payment.PaymentCallbackRequest) request,
              (io.grpc.stub.StreamObserver<payment.PaymentCallbackResponse>) responseObserver);
          break;
        case METHODID_CHECK_TRANSACTION_STATUS:
          serviceImpl.checkTransactionStatus((payment.CheckTransactionRequest) request,
              (io.grpc.stub.StreamObserver<payment.CheckTransactionResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              payment.CreateTransactionRequest,
              payment.CreateTransactionResponse>(
                service, METHODID_CREATE_TRANSACTION)))
        .addMethod(
          getGenerateQRMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              payment.GenerateQRRequest,
              payment.GenerateQRResponse>(
                service, METHODID_GENERATE_QR)))
        .addMethod(
          getHandlePaymentCallbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              payment.PaymentCallbackRequest,
              payment.PaymentCallbackResponse>(
                service, METHODID_HANDLE_PAYMENT_CALLBACK)))
        .addMethod(
          getCheckTransactionStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              payment.CheckTransactionRequest,
              payment.CheckTransactionResponse>(
                service, METHODID_CHECK_TRANSACTION_STATUS)))
        .build();
  }

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return payment.PaymentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PaymentServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getGenerateQRMethod())
              .addMethod(getHandlePaymentCallbackMethod())
              .addMethod(getCheckTransactionStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
