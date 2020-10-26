package br.senaigo.mobile.retrotrit2.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.senaigo.mobile.retrotrit2.R;
import br.senaigo.mobile.retrotrit2.bootstrap.FilmsAPI;
import br.senaigo.mobile.retrotrit2.model.DefaultModel;
import br.senaigo.mobile.retrotrit2.model.Films;
import br.senaigo.mobile.retrotrit2.resource.FilmsResource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FilmsActivity extends AppCompatActivity {

    Retrofit retrofit;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);
    }

    public void listarFilms(View view) {

        retrofit = FilmsAPI.getClient();

        FilmsResource filmsResource = retrofit.create(FilmsResource.class);

        Call<DefaultModel> lista = filmsResource.get();

        lista.enqueue(new Callback<DefaultModel>() {
            @Override
            public void onResponse(Call<DefaultModel> call, Response<DefaultModel> response) {
                DefaultModel films = response.body();

                /*try {
                    for (int i = 0; i < films.size(); i++) {
                        Log.i("post", String.format("%d %s", i, films.get(i).toString()));
                    }
                } catch (Exception e) {
                    Log.i("Deu ruim", e.getMessage());
                }*/
            }

            @Override
            public void onFailure(Call<DefaultModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(),
                        "Ocorreu um erro no serviço.",
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}