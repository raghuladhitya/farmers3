package com.example.android.farmers;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    ArrayList<Farmer> farmers;

    public RecycleViewAdapter(ArrayList<Farmer> farmers) {
        this.farmers = farmers;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image1;
        TextView imageName,farmerLoc,bar,description,Stock,Detail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            farmerLoc = (TextView) itemView.findViewById(R.id.farmer_loc);
            image1 = (CircleImageView) itemView.findViewById(R.id.image);
            bar = (TextView)itemView.findViewById(R.id.barrier);
            Stock = (TextView)itemView.findViewById(R.id.Goods_stock);
            description =(TextView) itemView.findViewById(R.id.Description);
            imageName = (TextView)itemView.findViewById(R.id.image_view);
            Detail = (TextView)itemView.findViewById(R.id.Details);
        }
    }
    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_view,viewGroup,false);

       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.ViewHolder viewHolder, int i) {
        Farmer f = farmers.get(i);


        viewHolder.imageName.setText(f.getProfilePic());
        viewHolder.Detail.setText(f.getDetails());
        viewHolder.Stock.setText(f.getStock());
        viewHolder.description.setText(f.getDescription());
        viewHolder.farmerLoc.setText(f.getLocation());
        Picasso.get().load(f.getProfilePic()).into(viewHolder.image1);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
