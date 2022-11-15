package com.example.containmentzonedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button submit;
    Intent intent;
    Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.button2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        intent = new Intent(this, MainActivity2.class);
        intent1 = new Intent(this, forgotpassord.class);
    }

    public void register1(View view) {
        if (view.getId() == R.id.textView12) {
            startActivity(intent);
        }
    }

    public void fort(View view) {
        if (view.getId() == R.id.textView10) {
            startActivity(intent1);
        }
    }
}
