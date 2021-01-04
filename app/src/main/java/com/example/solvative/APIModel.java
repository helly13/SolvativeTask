package com.example.solvative;

import com.example.solvative.Model.API;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class APIModel {

    private static final String url="https://reqres.in/api/users";

    public interface GetService{
        @GET(url+"?page=1")
        Call<API> getItems();
    }

    public static GetService getServiceList=null;

    public static GetService getService()
    {
        if(getServiceList==null)
        {
            //create
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(url+"/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            getServiceList=retrofit.create((GetService.class));
        }
        return getServiceList;
    }
}
