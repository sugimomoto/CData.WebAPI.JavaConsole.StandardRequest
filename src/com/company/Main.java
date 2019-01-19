package com.company;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

  public static final String url = "http://cdatanorthwindsampleapiserver.azurewebsites.net/api.rsc/";
  public static final String categories = "categories";
  public static final String orders = "orders";
  public static final String order_details = "order_details";
  public static final String products = "products";

  public static final String authHeaderName = "x-cdata-authtoken";
  public static final String authHeaderValue = "XXXXXXXXXXX";

  public static void main(String[] args) throws Exception {

        OkHttpClient client = new OkHttpClient();

        Response ordersResponse = client.newCall(
                new Request.Builder().addHeader(authHeaderName,authHeaderValue).url(url + orders).build()
                ).execute();

        Response orderDetailsResponse = client.newCall(
                new Request.Builder().addHeader(authHeaderName,authHeaderValue).url(url + order_details).build()
                ).execute();

        Gson gson = new Gson();

        OrderRootObject orders = gson.fromJson(ordersResponse.body().string(), OrderRootObject.class);
        OrderDetailRootObject orderDetails = gson.fromJson(orderDetailsResponse.body().string(), OrderDetailRootObject.class);

        for (OrderDetail orderDetail : orderDetails.Value) {
            List<Order> order = orders.Value.stream().filter(x -> x.OrderId.equals(orderDetail.OrderId)).collect(Collectors.toList());

            if(order.isEmpty())
              continue;

            System.out.println("--------------------------------------------");
            System.out.println("OrderId : " + order.get(0).OrderId);
            System.out.println("CustomerId : " + order.get(0).CustomerId);
            System.out.println("EmployeeId : " + order.get(0).EmployeeId);
            System.out.println("Discount : " + orderDetail.Discount);
            System.out.println("ProductId : " + orderDetail.ProductId);
            System.out.println("Quantity : " + orderDetail.Quantity);
            System.out.println("UnitPrice : " + orderDetail.UnitPrice);
        }
    }
}



