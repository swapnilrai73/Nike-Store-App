package com.example.nikestoreapplication.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nikestoreapplication.R;

public class PlaceOrderActivity extends AppCompatActivity {
    TextView finalPrice;
    ImageView backToProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);

        finalPrice=(TextView)findViewById(R.id.txt_total_cash);
        Intent i = getIntent();
        String total = i.getStringExtra("priceTotal");
        finalPrice.setText(total);

        backToProduct=(ImageView)findViewById(R.id.back_arrow_place_order);
        backToProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(PlaceOrderActivity.this,MainActivity.class);
                startActivity(k);
            }
        });
    }
}
