package br.senaigo.mobile.retrotrit2.resource;

import br.senaigo.mobile.retrotrit2.model.DefaultModel;
import br.senaigo.mobile.retrotrit2.model.Films;
import br.senaigo.mobile.retrotrit2.model.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface FilmsResource {

    @POST("films")
    Call<Films> post(@Body Films films);

    @GET("films/{id}")
    Call<Films> get(@Path("id") Integer id);

    @GET("films")
    Call<DefaultModel> get();

    @PUT("films/{id}")
    Call<Void> put(@Path("id") Integer id, @Body Post post);

    @PATCH("films/{id}")
    Call<Void> patch(@Path("id") Integer id, @Body Post post);

    @DELETE("films/{id}")
    Call<Void> delete(@Path("id") Integer id);

}