package com.example.android.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view_id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        ListItem item1 = new ListItem("Movie1", "Romantic", "4.5");
        ListItem item2 = new ListItem("Movie2", "Horror", "4.2");
        ListItem item3 = new ListItem("Movie3", "Comedy", "4");
        ListItem item4 = new ListItem("Movie4", "Family", "3");

      /*  for(int i=0; i<10 ; i++){
            ListItem item = new ListItem("Item"+(i+1),"description");
            listItems.add(item);
        }*/

        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);
        listItems.add(item4);

        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);

    }
}
