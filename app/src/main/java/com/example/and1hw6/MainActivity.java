package com.example.and1hw6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.and1hw6.databinding.ActivityMainBinding;
import com.example.and1hw6.fragments.actionFragment.ActionFragment;
import com.example.and1hw6.fragments.homeFragment.HomeFragment;
import com.example.and1hw6.fragments.profileFragment.BasicFragment;
import com.example.and1hw6.fragments.profileFragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private TextView textToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomNav();
    }

    private void initBottomNav() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        textToolbar = findViewById(R.id.tv_toolbar);
        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new HomeFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.hom:
                        textToolbar.setText("\uD835\uDCD8\uD835\uDCF7\uD835\uDCFC\uD835\uDCFD\uD835\uDCEA\uD835\uDCF0\uD835\uDCFB\uD835\uDCEA\uD835\uDCF6");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new HomeFragment()).commit();
                        break;
                    case R.id.like:
                        textToolbar.setText("\uD835\uDCD5\uD835\uDCF8\uD835\uDCF5\uD835\uDCF5\uD835\uDCF8\uD835\uDD00\uD835\uDCF2\uD835\uDCF7\uD835\uDCF0");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new ActionFragment()).commit();
                        break;
                    case R.id.profile:
                        textToolbar.setText("\uD835\uDCDD\uD835\uDCF2\uD835\uDCEC\uD835\uDCF4\uD835\uDCDD\uD835\uDCEA\uD835\uDCF6\uD835\uDCEE");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new BasicFragment()).commit();
                        break;
                }
                return true;
            }
        });
    }
}