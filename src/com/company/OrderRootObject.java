package com.company;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderRootObject {
    @SerializedName("@odata.context")
    public String Context;

    @SerializedName("value")
    public List<Order> Value;
}
