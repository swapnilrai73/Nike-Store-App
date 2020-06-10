package com.example.nikestoreapplication.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.nikestoreapplication.R;

public class ProductDetailsActivity extends AppCompatActivity {
    ImageView back,productImage;
    TextView productName,productPrice;
    Button buyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        buyButton=(Button)findViewById(R.id.buy_button);
        productImage=(ImageView)findViewById(R.id.big_image);
        productName=(TextView)findViewById(R.id.big_name);
        productPrice=(TextView)findViewById(R.id.big_price);
        back=(ImageView)findViewById(R.id.back_arrow);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProductDetailsActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String price = i.getStringExtra("price");
        String imgUrl = i   .getStringExtra("Url");

        productName.setText(name);
        productPrice.setText(price);
        Glide.with(this).asBitmap().load(imgUrl).into(productImage);

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(ProductDetailsActivity.this,PlaceOrderActivity.class);
                String priceTotal = productPrice.getText().toString();
                j.putExtra("priceTotal",priceTotal);
                startActivity(j);
            }
        });
    }
}
