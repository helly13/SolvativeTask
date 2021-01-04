package com.example.solvative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.solvative.Adapter.ItemListAdapter;
import com.example.solvative.Model.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;

public class ItemList extends AppCompatActivity {

    RecyclerView recyclerView;
//    String url="https://reqres.in/api/users?page=1/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_container);

        recyclerView=(RecyclerView) findViewById(R.id.rv_container);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadData();
    }



    public void loadData()
    {
        Call<API> itemList=APIModel.getService().getItems();
        itemList.enqueue(new Callback<API>() {
            @Override
            public void onResponse(Call<API> call, Response<API> response) {
                Log.e("API","res::"+response.body());
                API items=response.body();
                recyclerView.setAdapter(new ItemListAdapter(ItemList.this, items.getData()));
            }

            @Override
            public void onFailure(Call<API> call, Throwable t) {
                Log.e("API","res::"+t.getMessage());

            }
        });
    }
}