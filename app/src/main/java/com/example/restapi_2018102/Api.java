package com.example.restapi_2018102;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://al-quran-8d642.firebaseio.com/";
    @GET("data.json?print=pretty")
    Call<List<Results>> getSurah();
}
