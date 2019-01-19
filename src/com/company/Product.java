package com.company;

import com.google.gson.annotations.SerializedName;

public class Product {
  @SerializedName("product_id")
  public String ProductId;

  @SerializedName("category_id")
  public String CategoryId;

  @SerializedName("discontinued")
  public int Discontinued;

  @SerializedName("product_name")
  public String ProductName;
}
