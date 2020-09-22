package com.example.israeltourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.ViewHolder> {

    ArrayList<AttractionsDetails> attractionsDetails;

    public AttractionsAdapter(ArrayList<AttractionsDetails> attractionsDetails) {
        this.attractionsDetails = attractionsDetails;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(attractionsDetails.get(position).getmImageResourcesID());
        holder.time_infoTextView.setText(attractionsDetails.get(position).getmTimeInfo());
        holder.attraction_nameTextView.setText(attractionsDetails.get(position).getmAttractionName());
        holder.location_nameTextView.setText(attractionsDetails.get(position).getmLocationName());
    }

    @Override
    public int getItemCount() {
        return attractionsDetails.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView time_infoTextView;
        public TextView attraction_nameTextView;
        public TextView location_nameTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.time_infoTextView = itemView.findViewById(R.id.time_info);
            this.attraction_nameTextView = itemView.findViewById(R.id.attraction_name);
            this.location_nameTextView = itemView.findViewById(R.id.location_name);
        }
    }

}
