package com.example.schet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.subtraction.setOnClickListener(view -> {
            startActivity(subtractionActivity.getInstancesubstraction(this));
        });
        binding.summation.setOnClickListener(view -> {
            startActivity(summationActivity.getInstancesummation(this));

        });
        binding.multiplication.setOnClickListener(view -> {
            startActivity(multiplicationActivity.getInstancemultiplication(this));
        });
        binding.division.setOnClickListener(view -> {
            startActivity(divisionActivity.getInstancedivision(this));
        });
        binding.play.setOnClickListener(view -> {
            startActivity(play9Activity.getInstancePlay9(this));
        });
    }

    public static Intent getInstanceMenu(Context context) {
        return new Intent(context, MenuActivity.class);
    }
}