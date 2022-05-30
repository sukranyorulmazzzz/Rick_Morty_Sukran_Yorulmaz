package com.example.rickandmortybysukranyorulmaz.Api;

import com.example.rickandmortybysukranyorulmaz.Model.Character;
import com.example.rickandmortybysukranyorulmaz.Model.Location;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("character/1,2,3,4,5,6,7,8,9,10")
    Call<List<Character>> getCharacterList1();

    @GET("location/1,2,3,4,5,6,7,8,9,10")
    Call<List<Location>> getCharacterLocation1();

    @GET("character/11,12,13,14,15,16,17,18,19,20")
    Call<List<Character>> getCharacterList2();

    @GET("character/11,12,13,14,15,16,17,18,19,20")
    Call<List<Location>> getCharacterLocation2();

    @GET("character/21,22,23,24,25,26,27,28,29,30")
    Call<List<Character>> getCharacterList3();

    @GET("character/21,22,23,24,25,26,27,28,29,30")
    Call<List<Location>> getCharacterLocation3();

    @GET("character/31,32,33,34,35,36,37,38,39,40")
    Call<List<Character>> getCharacterList4();

    @GET("character/31,32,33,34,35,36,37,38,39,40")
    Call<List<Location>> getCharacterLocation4();

    @GET("character/41,42,43,44,45,46,47,48,49,50")
    Call<List<Character>> getCharacterList5();

    @GET("character/41,42,43,44,45,46,47,48,49,50")
    Call<List<Location>> getCharacterLocation5();

}
