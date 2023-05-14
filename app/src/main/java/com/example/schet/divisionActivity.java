package com.example.schet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.schet.databinding.ActivityDivisionBinding;

public class divisionActivity extends AppCompatActivity {
    ActivityDivisionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityDivisionBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        int Answer = setAnswer();


        binding.chek.setOnClickListener(view -> {
            if (String.valueOf(Answer).equals(binding.answer.getText().toString())) {
                Toast.makeText(getApplicationContext(), R.string.True, Toast.LENGTH_SHORT).show();

                startActivity(divisionActivity.getInstancedivision(this));
            } else {
                Toast.makeText(getApplicationContext(), R.string.False, Toast.LENGTH_SHORT).show();

                startActivity(divisionActivity.getInstancedivision(this));
            }
        });
        binding.goMenu.setOnClickListener(view -> {
            startActivity(MenuActivity.getInstanceMenu(this));
        });
    }


    int setAnswer() {
        int a=0,b = 0;
        while (b==0 || a%b!=0){
            a = (int) (Math.random() * 100);
            b = (int) (Math.random() * 100);
        }

        binding.example.setText(a + "  / " + b + " = ");
        return a / b;

    }


    public static Intent getInstancedivision(Context context) {
        return new Intent(context, divisionActivity.class);
    }
}