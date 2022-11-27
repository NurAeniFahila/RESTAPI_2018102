package com.example.restapi_2018102;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listV = findViewById(R.id.listV);
        getSurah();
    }

    private void getSurah() {
        retrofit2.Call<List<Results>> call = RetrofitClient.getInstance().getMyApi().getSurah();
        call.enqueue(new Callback<List<Results>>() {
            @Override
            public void onResponse(retrofit2.Call<List<Results>> call, Response<List<Results>> response) {
                List<Results> myheroList = response.body();
                String[] data = new String[myheroList.size()];

                for (int i = 0; i < myheroList.size(); i++) {
                    data[i] = myheroList.get(i).getNama();
                }

                listV.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, data));
            }

            @Override
            public void onFailure(Call<List<Results>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }

        });
    }
}
