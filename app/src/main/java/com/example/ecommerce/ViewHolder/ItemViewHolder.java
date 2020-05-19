package com.example.ecommerce.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.Interface.ItemClickListener;
import com.example.ecommerce.R;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textProductName, textProductDescription, textProductPrice, textProductStatus;
    public ImageView imageView;
    public ItemClickListener listner;



    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=(ImageView) itemView.findViewById(R.id.product_seller_image);
        textProductName=(TextView) itemView.findViewById(R.id.product_seller_name);
        textProductDescription=(TextView) itemView.findViewById(R.id.product_seller_description);
        textProductPrice=(TextView) itemView.findViewById(R.id.product_seller_price);
        textProductStatus=(TextView) itemView.findViewById(R.id.product_status);
    }

    public void setItemClickListner(ItemClickListener listner){
        this.listner=listner;
    }

    @Override
    public void onClick(View v) {
        listner.onClick(v,getAdapterPosition(),false);
    }
}

