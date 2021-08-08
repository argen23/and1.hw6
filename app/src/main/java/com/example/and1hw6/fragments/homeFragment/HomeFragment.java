package com.example.and1hw6.fragments.homeFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1hw6.R;
import com.example.and1hw6.databinding.FragmentHomeBinding;
import com.example.and1hw6.models.User;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
private FragmentHomeBinding binding;
private RecyclerView rv;
private HomeAdapter adapter;
private ArrayList<User> list;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new HomeAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initFirstRecycler(view);

    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new User("19 september","strhsrdgthe rgtrh", R.drawable.ct));
        list.add(new User("19 september","strhsrdgthe rgtrh", R.drawable.ct));
        list.add(new User("19 september","strhsrdgthe rgtrh", R.drawable.ct));
        list.add(new User("19 september","strhsrdgthe rgtrh", R.drawable.ct));
    }

    private void initFirstRecycler(View view) {
        rv = view.findViewById(R.id.first_rv);
        rv.setAdapter(adapter);
        adapter.addList(list);
    }
}