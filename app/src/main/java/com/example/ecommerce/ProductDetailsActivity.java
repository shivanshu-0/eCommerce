package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProductDetailsActivity extends AppCompatActivity {

    private FloatingActionButton addToCartBtn;
    private ImageView productImage;
    private ElegantNumberButton numberButton;
    private TextView productPrice, productDescription, productName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        addToCartBtn=(FloatingActionButton) findViewById(R.id.add_product_to_cart_btn);
        numberButton=(ElegantNumberButton) findViewById(R.id.number_btn);
        productImage=(ImageView) findViewById(R.id.product_image_details);
        productPrice=(TextView) findViewById(R.id.product_price_details);
        productDescription=(TextView) findViewById(R.id.product_description_details);
        productName=(TextView) findViewById(R.id.product_name_details);
    }
}
