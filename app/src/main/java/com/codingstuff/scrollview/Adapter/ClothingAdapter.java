package com.codingstuff.scrollview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codingstuff.scrollview.Model.Clothing;
import com.codingstuff.scrollview.R;

import java.util.List;

public class ClothingAdapter extends RecyclerView.Adapter<ClothingAdapter.ClothingViewHOlder> {

    private List<Clothing> clothingList;

    public ClothingAdapter(List<Clothing> clothingList){
        this.clothingList = clothingList;
    }
    @NonNull
    @Override
    public ClothingViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.clothing_layout , parent , false);
        return new ClothingViewHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClothingViewHOlder holder, int position) {
        holder.offer.setText(clothingList.get(position).getOffer());
        holder.mImageView.setImageResource(clothingList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return clothingList.size();
    }

    public class ClothingViewHOlder extends RecyclerView.ViewHolder{

        private TextView offer;
        private ImageView mImageView;
        public ClothingViewHOlder(@NonNull View itemView) {
            super(itemView);

            offer = itemView.findViewById(R.id.clothing_offer_tv);
            mImageView = itemView.findViewById(R.id.clothing_image);
        }
    }
}
