package ru.startandroid.startandroid5and6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity  {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecret, button1, button2, button3, button4, button5;
        ConstraintLayout llSecret;
        llSecret = findViewById(R.id.llSecret);

        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener(view -> llSecret.setVisibility(View.VISIBLE));

        btnSecret = findViewById(R.id.btnSecret);
        btnSecret.setOnClickListener(view -> llSecret.setVisibility(View.INVISIBLE));


        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> Toast.makeText(this, getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show());


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view -> Snackbar.make(view, getResources().getString(R.string.snackbar), Snackbar.LENGTH_SHORT).show());

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                 builder.setTitle(getResources().getString(R.string.titleName))
                .setMessage(getResources().getString(R.string.alertMassage))
                .setCancelable(false)
                .setPositiveButton(getResources().getString(R.string.alertPositiveButton), (dialogInterface, i) -> {
                });
        AlertDialog alert = builder.create();
        alert.show();});

        button4 = findViewById(R.id.button4);
        button4.setOnTouchListener((view, motionEvent) -> {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(this, getResources().getString(R.string.toast_btnTouchDown), Toast.LENGTH_SHORT).show();
            return true;
        }
            return false;
        });

        button5 = findViewById(R.id.button5);
        button5.setOnTouchListener((view, motionEvent) -> {
        if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
            Toast.makeText(this, getResources().getString(R.string.toast_btnTouchUp), Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
        });
    }
}