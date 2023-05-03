package com.example.schet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivitySubtractionBinding;

public class subtractionActivity extends AppCompatActivity {
    ActivitySubtractionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySubtractionBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.score.setText("score: " + MenuActivity.score);
        int Answer = setAnswer();
        binding.chek.setOnClickListener(view -> {
            if (String.valueOf(Answer).equals(binding.answer.getText().toString())) {
                Toast.makeText(getApplicationContext(), "true", Toast.LENGTH_SHORT).show();
                MenuActivity.score++;
                binding.score.setText("score: " + MenuActivity.score);
            } else {
                Toast.makeText(getApplicationContext(), "False", Toast.LENGTH_SHORT).show();
                MenuActivity.score--;
                binding.score.setText("score: " + MenuActivity.score);
            }
        });
        binding.goMenu.setOnClickListener(view -> {
            startActivity(MenuActivity.getInstanceMenu(this));
        });
    }

    int setAnswer() {
        int a = -1, b = 0;
        while (a-b<0){
             a = (int) (Math.random() * 100);
             b = (int) (Math.random() * 100);
        }

        binding.example.setText(a + " - " + b + " =");
        return a - b;
    }

    public static Intent getInstancesubstraction(Context context) {
        return new Intent(context, subtractionActivity.class);
    }
}