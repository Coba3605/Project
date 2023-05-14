package com.example.schet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.start.setOnClickListener(view -> {
            startActivity(MenuActivity.getInstanceMenu(this));
        });
    }
}