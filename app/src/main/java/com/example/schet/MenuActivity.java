package com.example.schet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;

import android.media.MediaPlayer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    ActivityMenuBinding binding;
    MediaPlayer mediaPlayer;
    public static boolean hardmode;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.check.setOnClickListener(view -> {
            if (binding.check.isChecked()){
                hardmode = true;
            }
            else {
                hardmode = false;
            }
        });

        binding.subtraction.setOnClickListener(view -> {
            mediaPlayer.stop();
            startActivity(subtractionActivity.getInstancesubstraction(this));
        });
        binding.summation.setOnClickListener(view -> {
            mediaPlayer.stop();
            startActivity(summationActivity.getInstancesummation(this));

        });
        binding.multiplication.setOnClickListener(view -> {
            mediaPlayer.stop();
            startActivity(multiplicationActivity.getInstancemultiplication(this));
        });
        binding.division.setOnClickListener(view -> {
            mediaPlayer.stop();
            startActivity(divisionActivity.getInstancedivision(this));
        });
        binding.play.setOnClickListener(view -> {
            mediaPlayer.stop();
            startActivity(play9Activity.getInstancePlay9(this));
        });
        binding.info.setOnClickListener(view -> {
            TextView message,info;
            Dialog dialog = new Dialog(MenuActivity.this);
            dialog.setContentView(R.layout.dialog);
            message = dialog.findViewById(R.id.dialog_1);
            info = dialog.findViewById(R.id.dialog_time);
            message.setText("О приложении:");
            message.setTextColor(getResources().getColor(R.color.green));
            info.setText(R.string.info);
            dialog.show();
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer = MediaPlayer.create(this,R.raw.song_nocturne);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }

    public static Intent getInstanceMenu(Context context) {
        return new Intent(context, MenuActivity.class);
    }
}