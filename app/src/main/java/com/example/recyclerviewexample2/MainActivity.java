package com.example.recyclerviewexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //declare arrayList for products
    ArrayList<Product> productArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //data
        productArrayList = new ArrayList<>();
        productArrayList.add(new Product("product 1",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 2",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 3",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 4",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 5",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 6",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 7",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 8",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 9",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 10",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 11",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 12",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 13",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 14",R.drawable.ic_launcher_background));
        productArrayList.add(new Product("product 15",R.drawable.ic_launcher_background));


        //declare custom adapter
        RecyclerAdapter adapter = new RecyclerAdapter(this,productArrayList);

        //link RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //determine type of LayoutManager as GridLayoutManager with 2 columns
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        //set recyclerView adapter
        recyclerView.setAdapter(adapter);



    }
}
