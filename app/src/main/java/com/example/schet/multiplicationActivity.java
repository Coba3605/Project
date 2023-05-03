package com.example.schet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.schet.databinding.ActivityMultiplicationBinding;

public class multiplicationActivity extends AppCompatActivity {
    ActivityMultiplicationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMultiplicationBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.score.setText("score: "+MenuActivity.score);

        int Answer = setAnswer();

        binding.chek.setOnClickListener(view -> {
            if (String.valueOf(Answer).equals(binding.answer.getText().toString())) {
                Toast.makeText(getApplicationContext(), "true", Toast.LENGTH_SHORT).show();
                MenuActivity.score++;
                binding.score.setText("score: "+MenuActivity.score);
            } else {
                Toast.makeText(getApplicationContext(), "False", Toast.LENGTH_SHORT).show();
                MenuActivity.score--;
                binding.score.setText("score: "+MenuActivity.score);
            }
        });
        binding.goMenu.setOnClickListener(view -> {
            startActivity(MenuActivity.getInstanceMenu(this));
        });
    }


    int setAnswer() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        binding.example.setText(a + "  * " + b + " = ");
        return a * b;
    }


    public static Intent getInstancemultiplication(Context context) {
        return new Intent(context, multiplicationActivity.class);
    }
}
