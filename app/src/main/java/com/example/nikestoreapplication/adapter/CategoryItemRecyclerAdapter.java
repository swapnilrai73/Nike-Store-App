package com.example.nikestoreapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nikestoreapplication.R;
import com.example.nikestoreapplication.model.CategoryItem;
import com.example.nikestoreapplication.model.ProductDetailsActivity;

import java.util.List;

public class CategoryItemRecyclerAdapter  extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder>{
    private Context context;
    private List<CategoryItem> categoryItemList;

    CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
        this.context=context;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.category_row_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, final int position) {
        holder.itemName.setText(categoryItemList.get(position).getName());
        holder.itemPrice.setText(categoryItemList.get(position).getPrice());
        Glide.with(context).load(categoryItemList.get(position).getImageUrl()).into(holder.itemImage);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ProductDetailsActivity.class);
                i.putExtra("name",categoryItemList.get(position).getName());
                i.putExtra("price",categoryItemList.get(position).getPrice());
                i.putExtra("Url",categoryItemList.get(position).getImageUrl());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    static final class CategoryItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemPrice,itemName;


        CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.category_image);
            itemName = itemView.findViewById(R.id.category_shoe);
            itemPrice = itemView.findViewById(R.id.category_price);
        }
    }
}
