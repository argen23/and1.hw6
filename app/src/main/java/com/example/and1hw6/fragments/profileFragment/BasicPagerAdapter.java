package com.example.and1hw6.fragments.profileFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class BasicPagerAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> list;

    public BasicPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public void setList(ArrayList<Fragment> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new ProfileFragment();
            case 1:
                return new ProfileSecondFragment();
            default:
                return new ProfileFragment();
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
