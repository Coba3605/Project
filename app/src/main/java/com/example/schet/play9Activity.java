package com.example.schet;

import static com.example.schet.R.raw.win;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;

import android.widget.Button;
import android.widget.TextView;

import com.example.schet.databinding.ActivityPlay9Binding;

import java.util.ArrayList;


public class play9Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int time = 11000,counter = 0,miss = 0;
    boolean flag = false;
    ArrayList<Button> buttons = new ArrayList<Button>();
    ActivityPlay9Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityPlay9Binding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        buttons.add(binding.button1);
        buttons.add(binding.button2);
        buttons.add(binding.button3);
        buttons.add(binding.button4);
        buttons.add(binding.button5);
        buttons.add(binding.button6);
        buttons.add(binding.button7);
        buttons.add(binding.button8);
        buttons.add(binding.button9);
        random(buttons);
        Tap();



    }

    private void Tap() {
        binding.button1.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button1.getText()) - counter == 1){
                binding.button1.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button1.getText())-counter < 1){
                    binding.button1.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button1.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button2.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button2.getText()) - counter == 1){
                binding.button2.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button2.getText())-counter < 1){
                    binding.button2.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button2.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button3.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button3.getText()) - counter == 1){
                binding.button3.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button3.getText())-counter < 1){
                    binding.button3.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button3.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button4.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button4.getText()) - counter == 1){
                binding.button4.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button4.getText())-counter < 1){
                    binding.button4.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button4.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button5.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button5.getText()) - counter == 1){
                binding.button5.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button5.getText())-counter < 1){
                    binding.button5.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button5.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button6.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button6.getText()) - counter == 1){
                binding.button6.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button6.getText())-counter < 1){
                    binding.button6.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button6.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button7.setOnClickListener(view -> {
            if (!flag ) {
            timer(time);
            flag = true;
        }
            if (Integer.parseInt((String) binding.button7.getText()) - counter == 1){
                binding.button7.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button7.getText())-counter < 1){
                    binding.button7.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button7.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button8.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button8.getText()) - counter == 1){
                binding.button8.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button8.getText())-counter < 1){
                    binding.button8.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button8.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
        binding.button9.setOnClickListener(view -> {
            if (!flag ) {
                timer(time);
                flag = true;
            }
            if (Integer.parseInt((String) binding.button9.getText()) - counter == 1){
                binding.button9.setBackgroundColor(getResources().getColor(R.color.salad));
                counter++;

            }
            else {
                if (Integer.parseInt((String) binding.button9.getText())-counter < 1){
                    binding.button9.setBackgroundColor(getResources().getColor(R.color.salad));
                }
                else {
                    binding.button9.setBackgroundColor(getResources().getColor(R.color.red));
                }
                miss++;
            }
        });
    }



    private ArrayList<Integer> random(ArrayList<Button> buttons){
        int num,i = 0;
        ArrayList<Integer> btnum = new ArrayList<Integer>();
        while (btnum.size()<9){
            num = (int) (Math.random() * 10);
            if (!btnum.contains(num) && num !=0){
                btnum.add(num);
                buttons.get(i).setText(String.valueOf(num));
                i++;
            }
        }
        return btnum;
    }

    private void timer(long time){
        mediaPlayer = MediaPlayer.create(this,R.raw.play);
        mediaPlayer.start();
        CountDownTimer countDownTimer = new CountDownTimer(time,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (counter == 9){
                    cancel();

                    onFinish();
                }
                if ((millisUntilFinished/1000)-1>=0){
                    binding.timer.setText(millisUntilFinished/1000-1+"");
                }
            }

            @Override
            public void onFinish() {
                TextView message,res_time,res_miss;
                mediaPlayer.stop();
                Dialog dialog = new Dialog(play9Activity.this);
                dialog.setTitle("Results");
                dialog.setContentView(R.layout.dialog);
                message = dialog.findViewById(R.id.dialog_1);
                res_time = dialog.findViewById(R.id.dialog_time);
                res_miss = dialog.findViewById(R.id.dialog_miss);
                if (counter == 9){
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), win);
                    mediaPlayer.start();
                    message.setText(R.string.win);
                    message.setTextColor(getResources().getColor(R.color.green));
                }
                else {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.lose);
                    mediaPlayer.start();
                    message.setText(R.string.lose);
                    message.setTextColor(getResources().getColor(R.color.red));
                }

                res_time.setText(getString(R.string.time_spent)+(10 - Integer.parseInt(binding.timer.getText().toString())));
                res_miss.setText(getString(R.string.miss_made)+ miss);
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
        }.start();
    }



    public static Intent getInstancePlay9(Context context) {
        return new Intent(context, play9Activity.class);
    }
}