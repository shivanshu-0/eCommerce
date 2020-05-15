package com.example.ecommerce.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.Interface.ItemClickListener;
import com.example.ecommerce.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textProductName, textProductDescription, textProductPrice;
    public ImageView imageView;
    public ItemClickListener listner;



    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=(ImageView) itemView.findViewById(R.id.product_image);
        textProductName=(TextView) itemView.findViewById(R.id.product_name);
        textProductDescription=(TextView) itemView.findViewById(R.id.product_description);
        textProductPrice=(TextView) itemView.findViewById(R.id.product_price);
    }

    public void setItemClickListner(ItemClickListener listner){
        this.listner=listner;
    }

    @Override
    public void onClick(View v) {
        listner.onClick(v,getAdapterPosition(),false);
    }
}
