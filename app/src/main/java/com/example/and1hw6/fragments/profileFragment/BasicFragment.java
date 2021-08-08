package com.example.and1hw6.fragments.profileFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1hw6.R;
import com.example.and1hw6.databinding.FragmentBasicBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class BasicFragment extends Fragment {
    private FragmentBasicBinding binding;
    private ArrayList<Fragment> list;
    private BasicPagerAdapter basicPagerAdapter;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    public BasicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBasicBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createListFragment();
        initViewPager(view);

    }

    private void createListFragment() {
        list = new ArrayList<>();
        list.add(new ProfileFragment());
        list.add(new ProfileSecondFragment());

    }

    private void initViewPager(View view) {
        viewPager2 = view.findViewById(R.id.view_pager);
        tabLayout = view.findViewById(R.id.tab_layout);
        basicPagerAdapter = new BasicPagerAdapter(this);
        basicPagerAdapter.setList(list);
        viewPager2.setAdapter(basicPagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(R.drawable.ic_grid + (position));
            }
        }).attach();
    }
}