package ru.startandroid.startandroid5and6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button btnSecret = findViewById(R.id.btnSecret);
        ConstraintLayout llSecret = findViewById(R.id.llSecret);

        textView.setOnClickListener(view -> llSecret.setVisibility(View.VISIBLE));
        btnSecret.setOnClickListener(view -> llSecret.setVisibility(View.INVISIBLE));
    }
}