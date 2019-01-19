package com.company;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderDetail {

  @SerializedName("order_id")
  public String OrderId;

  @SerializedName("product_id")
  public String ProductId;

  @SerializedName("discount")
  public Double Discount;

  @SerializedName("quantity")
  public Double Quantity;

  @SerializedName("unit_price")
  public Double UnitPrice;
}

