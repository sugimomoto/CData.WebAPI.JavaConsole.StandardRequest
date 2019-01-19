package com.company;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainObject {
    @SerializedName("@odata.context")
    public String country;

    @SerializedName("value")
    public List<Category> value;
}
