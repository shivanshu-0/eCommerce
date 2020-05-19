package com.example.ecommerce.Seller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ecommerce.R;

public class SellerRegistrationActivity extends AppCompatActivity {

    private Button sellerLoginBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_registration);

        sellerLoginBegin=(Button) findViewById(R.id.seller_already_have_account_btn);

        sellerLoginBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SellerRegistrationActivity.this,SellerLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
