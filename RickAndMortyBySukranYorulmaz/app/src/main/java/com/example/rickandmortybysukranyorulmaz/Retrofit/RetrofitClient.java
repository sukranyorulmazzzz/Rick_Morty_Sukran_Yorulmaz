package com.example.rickandmortybysukranyorulmaz.Retrofit;

import com.example.rickandmortybysukranyorulmaz.Api.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL="https://rickandmortyapi.com/api/";
    private static Retrofit retrofit=null;

    public static ApiInterface getRetrofitClient(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
