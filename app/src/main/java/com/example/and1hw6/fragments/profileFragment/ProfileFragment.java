package com.example.and1hw6.fragments.profileFragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1hw6.R;
import com.example.and1hw6.databinding.FragmentProfileBinding;
import com.example.and1hw6.models.Student;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {
    private ArrayList<Student>list;
    private RecyclerView rv;
    private ProfileAdapter profileAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,null );
        list = new ArrayList<>();
        list.add(new Student(R.drawable.loh,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.loh));
        list.add(new Student(R.drawable.loh,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.loh,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.loh,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.loh,R.drawable.ct));
        list.add(new Student(R.drawable.ct,R.drawable.ct,R.drawable.ct));
        rv = view.findViewById(R.id.rv_three);
        profileAdapter = new ProfileAdapter(getContext(),list);
        rv.setLayoutManager(new GridLayoutManager(getContext(),3));
        rv.setAdapter(profileAdapter);
        return view;
    }

}