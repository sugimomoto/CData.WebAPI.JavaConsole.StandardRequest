package com.company;

import com.google.gson.annotations.SerializedName;

public class Order {

  @SerializedName("order_id")
  public String OrderId;

  @SerializedName("customer_id")
  public String CustomerId;

  @SerializedName("employee_id")
  public String EmployeeId;
}
