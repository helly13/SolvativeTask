package com.example.solvative;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;


import com.example.solvative.Adapter.ItemListAdapter;
import com.example.solvative.DB.User;
import com.example.solvative.DB.databse;

import java.util.List;

public class RoomItemList extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_container);

        recyclerView=(RecyclerView) findViewById(R.id.rv_container);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadData();

    }


    public void loadData()
    {
        databse db=databse.getDbInstance(RoomItemList.this);
        List<User> userList=db.userDAO().getAllUser();

//        recyclerView.setAdapter();
    }
}
