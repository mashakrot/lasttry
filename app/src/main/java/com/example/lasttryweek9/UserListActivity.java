package com.example.lasttryweek9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class UserListActivity extends AppCompatActivity {

    private UserStorage storage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        storage = UserStorage.getInstance();

        recyclerView = findViewById(R.id.rvRocketList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // RocketListAdapter displays the rocket information
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), storage.getUsers()));

    }
}