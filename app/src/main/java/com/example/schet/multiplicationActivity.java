package com.example.schet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.schet.databinding.ActivityMultiplicationBinding;

public class multiplicationActivity extends AppCompatActivity {
    ActivityMultiplicationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMultiplicationBinding.inflate(getLayoutInflater());
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
            startActivity(MenuActivity.getInstanceMenu(this));
        });
    }


    int setAnswer() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        binding.example.setText(a + "  * " + b + " = ");
        return a * b;
    }
    public void Check(boolean flag){
        TextView message,res;
        Dialog dialog = new Dialog(multiplicationActivity.this);
        dialog.setTitle("Results");
        dialog.setContentView(R.layout.dialog);
        message = dialog.findViewById(R.id.dialog_1);
        res = dialog.findViewById(R.id.dialog_time);
        if (flag){
            message.setText(R.string.True);
            message.setTextColor(getResources().getColor(R.color.green));
            res.setText(R.string.Anst);
        }
        else {
            message.setText(R.string.False);
            message.setTextColor(getResources().getColor(R.color.red));
            res.setText(R.string.Answ);
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


    public static Intent getInstancemultiplication(Context context) {
        return new Intent(context, multiplicationActivity.class);
    }
}
