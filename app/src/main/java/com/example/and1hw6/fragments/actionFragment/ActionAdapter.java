package com.example.and1hw6.fragments.actionFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and1hw6.R;
import com.example.and1hw6.fragments.homeFragment.HomeAdapter;
import com.example.and1hw6.models.Other;

import java.util.ArrayList;

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.ActionHolder> {
    private ArrayList<Other> list;
    private TextView tv1 , tv2 ;
    private ImageView img1 , img2 ;
    @NonNull
    @Override
    public ActionAdapter.ActionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_second,parent,false);
        return new ActionHolder(view);
    }

    public void addOther(ArrayList<Other> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ActionAdapter.ActionHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ActionHolder extends RecyclerView.ViewHolder {
        public ActionHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.user_name_tv);
            tv2 = itemView.findViewById(R.id.time_like);
            img1 = itemView.findViewById(R.id.ava);
            img2 = itemView.findViewById(R.id.photo_iv);

        }

        public void onBind(Other other) {
            tv1.setText(other.getName());
            tv2.setText(other.getTime());
            img1.setImageResource(other.getAva());
            img2.setImageResource(other.getPhoto());
        }
    }
}
