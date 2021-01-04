package com.example.solvative.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.solvative.Model.Datum;
import com.example.solvative.R;

import java.util.List;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemListViewHolder> {

    @Override
    public void onBindViewHolder(@NonNull ItemListViewHolder holder, int position) {

        Log.e("Adapter","DATA ::"+items.toString());
        String sfname=items.get(position).getFirstName()+"";
        String slname=items.get(position).getLastName()+"";
        String semail=items.get(position).getEmail()+"";
        String url=items.get(position).getAvatar()+"";

        holder.lname.setText(slname);
        holder.fname.setText(sfname);
        holder.email.setText(semail);

        Glide.with(context).load(url).into(holder.imageView);
    }

    private Context context;

    public ItemListAdapter(Context context, List<Datum> items) {
        this.context = context;
        this.items = items;
    }

    private List<Datum> items;

    public class ItemListViewHolder extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView fname,lname,email;

        public ItemListViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imgvw_user_itemlist);
            fname=itemView.findViewById(R.id.txt_fname_itemlist);
            lname=itemView.findViewById(R.id.txt_lname_itemname);
            email=itemView.findViewById(R.id.txt_email_itemlist);
        }

    }


    @NonNull
    @Override
    public ItemListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.activity_item_list,parent,false);
        return new ItemListViewHolder(view);
    }




    @Override
    public int getItemCount() {
        return items.size();
    }
}


