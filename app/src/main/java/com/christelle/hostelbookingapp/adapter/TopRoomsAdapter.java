package com.christelle.hostelbookingapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.christelle.hostelbookingapp.R;
import com.christelle.hostelbookingapp.model.RecentsData;
import com.christelle.hostelbookingapp.model.TopRoomsData;

import java.util.List;

public class TopRoomsAdapter extends RecyclerView.Adapter<TopRoomsAdapter.TopRoomsViewHolder> {

    Context context;
    List<TopRoomsData> TopRoomsDataList;

    public TopRoomsAdapter(Context context, List<TopRoomsData> TopRoomsDataList) {
        this.context = context;
        this.TopRoomsDataList = TopRoomsDataList;
    }

    @NonNull
    @Override
    public TopRoomsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.top_rooms_row_item, parent, false);

        //here we create a recyclerviewrow item
        return new TopRoomsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopRoomsViewHolder holder, int position) {

        holder.countryName.setText(TopRoomsDataList.get(position).getCountryName());
        holder.placeName.setText(TopRoomsDataList.get(position).getPlaceName());
        holder.price.setText(TopRoomsDataList.get(position).getPrice());
        holder.placeImage.setImageResource(TopRoomsDataList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return TopRoomsDataList.size();
    }

    public static final class TopRoomsViewHolder extends RecyclerView.ViewHolder {

        ImageView placeImage;
        TextView placeName, countryName, price;

        public TopRoomsViewHolder(@NonNull View itemView) {

            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            countryName = itemView.findViewById(R.id.country_name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
