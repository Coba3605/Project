package com.example.schet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivitySubtractionBinding;

public class subtractionActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ActivitySubtractionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySubtractionBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        int Answer = setAnswer();
        binding.chek.setOnClickListener(view -> {
            if (String.valueOf(Answer).equals(binding.answer.getText().toString())) {
                Check(true,Answer);
            } else {
                Check(false,Answer);
            }
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
    public void Check(boolean flag,int a){
        TextView message,res;
        Dialog dialog = new Dialog(subtractionActivity.this);
        dialog.setTitle("Results");
        dialog.setContentView(R.layout.dialog);
        message = dialog.findViewById(R.id.dialog_1);
        res = dialog.findViewById(R.id.dialog_time);
        if (flag){
            mediaPlayer = MediaPlayer.create(this,R.raw.win);
            mediaPlayer.start();
            message.setText(R.string.True);
            message.setTextColor(getResources().getColor(R.color.green));
            res.setText(R.string.Anst);
        }
        else {
            mediaPlayer = MediaPlayer.create(this,R.raw.lose);
            mediaPlayer.start();
            message.setText(R.string.False);
            message.setTextColor(getResources().getColor(R.color.red));
            res.setText(R.string.Trueanswer);
            res.append(String.valueOf(a));
        }
        dialog.show();
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                mediaPlayer.stop();
                finish();
                startActivity(getIntent());
            }
        });
    }

    public static Intent getInstancesubstraction(Context context) {
        return new Intent(context, subtractionActivity.class);
    }
}