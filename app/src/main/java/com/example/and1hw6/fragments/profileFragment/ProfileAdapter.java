package com.example.and1hw6.fragments.profileFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and1hw6.R;
import com.example.and1hw6.models.Student;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ThirdViewHolder> {
    private ArrayList<Student> list;

    @NonNull
    @Override
    public ProfileAdapter.ThirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_three,parent,false);
        return new ThirdViewHolder(view);
    }

    public ProfileAdapter(Context context, ArrayList<Student> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }
//
//    public void setList(Context context,ArrayList<Student> list) {
//        this.list = new ArrayList<>();
//        this.list = list;
//        notifyDataSetChanged();
//    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ThirdViewHolder holder, int position) {
        holder.onBind(list.get(position));
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new AlertDialog.Builder(v.getContext()).setTitle("Удаление")
//                        .setMessage("Вы точно хотите удалить?")
//                        .setNegativeButton("нет", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.cancel();
//                            }
//                        })
//                        .setPositiveButton("да", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                list.remove(position);
//                                notifyDataSetChanged();
//                            }
//                        }).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ThirdViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1, imageView2,imageView3;

        public ThirdViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.img_wallpaper1);
            imageView2 = itemView.findViewById(R.id.img_wallpaper2);
            imageView3 = itemView.findViewById(R.id.img_wallpaper3);

        }
        public void onBind(Student student) {
            imageView1.setImageResource(student.getPhoto1());
            imageView2.setImageResource(student.getPhoto2());
            imageView3.setImageResource(student.getPhoto3());

        }
    }
}
