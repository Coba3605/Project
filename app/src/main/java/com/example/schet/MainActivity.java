package com.example.schet;

import android.app.Dialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivityMainBinding;
import com.example.schet.databinding.DialogBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    DialogBinding dibinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dibinding = DialogBinding.inflate(getLayoutInflater());
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.start.setOnClickListener(view -> {
            startActivity(MenuActivity.getInstanceMenu(this));
        });
        binding.info.setOnClickListener(view -> {
            Dialog dialog = new Dialog(MainActivity.this);
        });
    }
}