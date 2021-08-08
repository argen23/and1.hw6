        package com.example.and1hw6.fragments.homeFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and1hw6.R;
import com.example.and1hw6.models.User;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private TextView tv1 , tv2 ;
    private ImageView img1;
    private ArrayList<User> list;
    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first,parent,false);
        return new ViewHolder(view);
    }

    public void addList(ArrayList<User> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv_time);
            tv2 = itemView.findViewById(R.id.tv_comm);
            img1 = itemView.findViewById(R.id.img_ct);
        }

        public void onBind(User user) {
            tv1.setText(user.getDate());
            tv2.setText(user.getComm());
            img1.setImageResource(user.getImg());
        }
    }
}
