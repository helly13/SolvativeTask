//package com.example.solvative.Adapter;
//
//import android.content.Context;
//import android.util.Log;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//import com.example.solvative.R;
//
//public class RoomDatabaseAdapter extends RecyclerView.Adapter<RoomDatabaseAdapter.RoomDBViewHolder> {
//
//
//    Context context;
//    List<User>
//
//    @NonNull
//    @Override
//    public RoomDBViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RoomDBViewHolder holder, int position) {
//
//        Log.e("Adapter","DATA ::"+items.toString());
//        String sfname=items.get(position).getFirstName()+"";
//        String slname=items.get(position).getLastName()+"";
//        String semail=items.get(position).getEmail()+"";
//        String url=items.get(position).getAvatar()+"";
//
//        holder.lname.setText(slname);
//        holder.fname.setText(sfname);
//        holder.email.setText(semail);
//
//        Glide.with(context).load(url).into(holder.imageView);
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class RoomDBViewHolder extends  RecyclerView.ViewHolder{
//
//        ImageView imageView;
//        TextView fname,lname,email;
//
//        public RoomDBViewHolder(@NonNull View itemView) {
//            super(itemView);
//            imageView=itemView.findViewById(R.id.imgvw_user_itemlist);
//            fname=itemView.findViewById(R.id.txt_fname_itemlist);
//            lname=itemView.findViewById(R.id.txt_lname_itemname);
//            email=itemView.findViewById(R.id.txt_email_itemlist);
//        }
//
//    }
//
//}
