package com.codingstuff.scrollview.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codingstuff.scrollview.Model.BestSeller;
import com.codingstuff.scrollview.R;

import java.util.List;

public class BestSellerAdapter extends RecyclerView.Adapter<BestSellerAdapter.BestSellerViewHolder> {

    private List<BestSeller> bestSellerList;
    public BestSellerAdapter(List<BestSeller> bestSellerList){
        this.bestSellerList = bestSellerList;
    }
    @NonNull
    @Override
    public BestSellerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_seller_layout , parent , false);
        return new BestSellerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BestSellerViewHolder holder, int position) {
        holder.mText.setText(bestSellerList.get(position).getOffer());
        holder.mImageview.setImageResource(bestSellerList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return bestSellerList.size();
    }

    public class BestSellerViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageview;
        private TextView mText;
        public BestSellerViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageview = itemView.findViewById(R.id.bestSellerImage);
            mText = itemView.findViewById(R.id.bestSellerText);
        }
    }
}
