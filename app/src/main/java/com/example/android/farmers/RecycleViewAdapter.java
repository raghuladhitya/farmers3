package com.example.android.farmers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    public Context context;
    public ArrayList<Farmer> f;

    public RecycleViewAdapter(Context c,ArrayList<Farmer> farmers) {
        context = c;
        f = farmers;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_list_view,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        viewHolder.farmerLoc.setText(f.get(i).getLocation());
        viewHolder.description.setText(f.get(i).getDescription());
        viewHolder.detail.setText(f.get(i).getDetails());
        viewHolder.farmerName.setText(f.get(i).getName());
        Picasso.get().load(f.get(i).getProfilePic()).into(viewHolder.imageView);
        viewHolder.Stock.setText(f.get(i).getStock());
    }

    @Override

    public int getItemCount() {
        return 0;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;
        TextView farmerName,farmerLoc,bar,description,Stock,detail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (CircleImageView) itemView.findViewById(R.id.image_no_1);

            Stock = (TextView)itemView.findViewById(R.id.Gooods_stock);
            description =(TextView) itemView.findViewById(R.id.Farmer_desc);
            farmerName = (TextView)itemView.findViewById(R.id.Farmer_name);
            detail = (TextView)itemView.findViewById(R.id.Details_no_1);
            farmerLoc = (TextView) itemView.findViewById(R.id.Farmer_Loc);

            bar = (TextView)itemView.findViewById(R.id.barrier);
        }
    }
}
