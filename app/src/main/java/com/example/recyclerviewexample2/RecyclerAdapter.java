package com.example.recyclerviewexample2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.ViewHolder>{

    //declare context and data arrayList, to receive it from MainActivity when we would like to create
    //new custom adapter from MainActivity
    private Context context;
    private ArrayList<Product> productArrayList;

   //constructor
    public RecyclerAdapter(Context context, ArrayList<Product> productArrayList) {
        this.context = context;
        this.productArrayList = productArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        ViewHolder holder = new ViewHolder(item);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //declare the currentObject
        Product currentObject = productArrayList.get(position);

        //set the data to views
        holder.title.setText(currentObject.getTitle());
        holder.image.setImageResource(currentObject.getImage());

        //send data to ViewHolder class(the data here is currentObject).
        //here we send the data ad hidden object by using setTag() method.
        holder.title.setTag(currentObject);
    }


    @Override
    public int getItemCount() {
        //return the data arrayList size
        return productArrayList.size();
    }

    //ViewHolder class
    class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //link views (title and image)
             title = (TextView) itemView.findViewById(R.id.title);
             image = (ImageView)itemView.findViewById(R.id.image);

            //when click on title, show massage
            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //receive currentObject from onBindViewHolder() method
                    Product currentObject =(Product) title.getTag();

                    Toast.makeText(context,"hi " + currentObject.getTitle(),Toast.LENGTH_SHORT).show();

                }
            });

            //when click on image, show massage
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //receive currentObject from onBindViewHolder() method
                    Product currentObject =(Product) title.getTag();

                    Toast.makeText(context,"hi image for " + currentObject.getTitle(),Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
