package br.senaigo.mobile.retrotrit2.bootstrap;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FilmsAPI {

    public static final String ENDPOINT = "https://swapi.dev/api/";

    public static Retrofit getClient() {

        return new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }


}
