package com.example.schet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.schet.databinding.ActivitySummationBinding;
import com.example.schet.databinding.DialogBinding;

public class summationActivity extends AppCompatActivity {
    ActivitySummationBinding binding;
    DialogBinding dibinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dibinding = DialogBinding.inflate(getLayoutInflater());
        binding = ActivitySummationBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        int Answer = setAnswer();

        binding.chek.setOnClickListener(view -> {
            if (String.valueOf(Answer).equals(binding.answer.getText().toString())) {
                Check(true);
            } else {
                Check(false);
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
    public void Check(boolean flag){
        setContentView(dibinding.getRoot());
        Dialog dialog = new Dialog(summationActivity.this);
        dialog.setTitle("Results");
        if (flag){
            dibinding.dialog1.setText(R.string.True);
            dibinding.dialog1.setTextColor(getResources().getColor(R.color.green));
            dibinding.dialogTime.setText(R.string.Anst);
        }
        else {
            dibinding.dialog1.setText(R.string.False);
            dibinding.dialog1.setTextColor(getResources().getColor(R.color.red));
            dibinding.dialogTime.setText(R.string.Answ);
        }
        dialog.show();
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                finish();
                startActivity(getIntent());
            }
        });
    }


    public static Intent getInstancesummation(Context context) {

        return new Intent(context, summationActivity.class);
    }
}