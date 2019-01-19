package com.company;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("category_name")
    public String CategoryName;

    @SerializedName("description")
    public String Description;

    @SerializedName("category_id")
    public int CategoryId;

    @SerializedName("picture")
    public String Picture;
}
