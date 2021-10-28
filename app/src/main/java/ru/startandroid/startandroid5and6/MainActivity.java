package ru.startandroid.startandroid5and6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecret, button1, button2, button3;

        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener(this);

        btnSecret = findViewById(R.id.btnSecret);
        btnSecret.setOnClickListener(this);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ConstraintLayout llSecret;
        llSecret = (ConstraintLayout) findViewById(R.id.llSecret);
        switch (view.getId()) {
            case R.id.textView:
                llSecret.setVisibility(View.VISIBLE);
                break;
            case R.id.btnSecret:
                llSecret.setVisibility(View.INVISIBLE);
                break;
            case R.id.button1:
                Toast.makeText(this, getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Snackbar.make(view, getResources().getString(R.string.snackbar), Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(getResources().getString(R.string.titleName))
                        .setMessage(getResources().getString(R.string.alertMassage))
                        .setCancelable(false)
                        .setPositiveButton(getResources().getString(R.string.alertPositiveButton), (dialogInterface, i) -> {

                        });
                AlertDialog alert = builder.create();
                alert.show();
                break;
        }

    }
}