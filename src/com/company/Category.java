package com.company;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("category_name")
    public String category_name;

    @SerializedName("description")
    public String description;

    @SerializedName("category_id")
    public int category_id;

    @SerializedName("picture")
    public String picture;
}
