package com.example.odev4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.odev4.databinding.ActivityMainBinding;
import com.example.odev4.databinding.BottomkullanimiBinding;

public class MainActivity extends AppCompatActivity {
    private BottomkullanimiBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = BottomkullanimiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        NavigationUI.setupWithNavController(binding.bottomNull,navHostFragment.getNavController());
    }
}