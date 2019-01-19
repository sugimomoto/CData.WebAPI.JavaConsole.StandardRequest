package com.company;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {

    public static void main(String[] args) throws Exception {

        OkHttpClient client = new OkHttpClient();
        String url = "http://cdatanorthwindsampleapiserver.azurewebsites.net/api.rsc";
        String authHeaderName = "x-cdata-authtoken";
        String authHeaderValue = "XXXXXXXXXXXXXX";

        Request request = new Request.Builder().addHeader(authHeaderName,authHeaderValue).url(url).build();

        Response response = client.newCall(request).execute();

        Gson gson = new Gson();

        MainObject responseObject = gson.fromJson(response.body().string(), MainObject.class);

        for (Category category : responseObject.value) {
            System.out.println("category_id : " + category.category_id);
            System.out.println("category_name : " + category.category_name);
        }
    }
}



