package com.example.schet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivitySummationBinding;

public class summationActivity extends AppCompatActivity {
    ActivitySummationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySummationBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        int Answer = setAnswer();

        binding.chek.setOnClickListener(view -> {
            if (String.valueOf(Answer).equals(binding.answer.getText().toString())) {
                Toast.makeText(getApplicationContext(), R.string.True, Toast.LENGTH_SHORT).show();

                startActivity(summationActivity.getInstancesummation(this));



            } else {
                Toast.makeText(getApplicationContext(), R.string.False, Toast.LENGTH_SHORT).show();

                startActivity(summationActivity.getInstancesummation(this));
            }
        });
        binding.goMenu.setOnClickListener(view -> {
            startActivity(MenuActivity.getInstanceMenu( this));
        });
    }


    int setAnswer() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        binding.example.setText(a + "  + " + b + " = ");
        return a + b;
    }


    public static Intent getInstancesummation(Context context) {

        return new Intent(context, summationActivity.class);
    }
}