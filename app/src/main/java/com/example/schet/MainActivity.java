package com.example.schet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivityMainBinding;
import com.example.schet.databinding.DialogBinding;

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
        binding.info.setOnClickListener(view -> {
            TextView message,info;
            Dialog dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.dialog);
            message = dialog.findViewById(R.id.dialog_1);
            info = dialog.findViewById(R.id.dialog_time);
            message.setText("О приложении:");
            message.setTextColor(getResources().getColor(R.color.green));
            info.setText(R.string.info);
            dialog.show();
        });
    }
}