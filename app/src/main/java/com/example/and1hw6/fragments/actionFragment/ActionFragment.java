package com.example.and1hw6.fragments.actionFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1hw6.R;
import com.example.and1hw6.databinding.FragmentActionBinding;
import com.example.and1hw6.models.Other;

import java.util.ArrayList;


public class ActionFragment extends Fragment {
    private FragmentActionBinding binding;
    private ArrayList<Other> list;
    private RecyclerView recyclerView;
    private ActionAdapter actionAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentActionBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createListSecond();
        initRv(view);
    }

    private void createListSecond() {
        list = new ArrayList<>();
        list.add(new Other("wewfg","1h",R.drawable.eawgg,R.drawable.awef));
        list.add(new Other("wewfg","1h",R.drawable.eawgg,R.drawable.awef));
        list.add(new Other("wewfg","1h",R.drawable.eawgg,R.drawable.awef));
        list.add(new Other("wewfg","1h",R.drawable.eawgg,R.drawable.awef));
        list.add(new Other("wewfg","1h",R.drawable.eawgg,R.drawable.awef));
        list.add(new Other("wewfg","1h",R.drawable.eawgg,R.drawable.awef));
    }

    private void initRv(View view) {
        actionAdapter = new ActionAdapter();
        recyclerView = view.findViewById(R.id.second_rv);
        recyclerView.setAdapter(actionAdapter);
        actionAdapter.addOther(list);
    }
}