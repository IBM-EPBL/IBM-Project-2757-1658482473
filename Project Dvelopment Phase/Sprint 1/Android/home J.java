package com.example.containmentzonedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button submit;
    Intent intent, intent1, intent2, intent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        submit = findViewById(R.id.regiter1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
        intent = new Intent(this, MainActivity3.class);
        intent1 = new Intent(this, MainActivity3.class);
        intent2 = new Intent(this, MainActivity3.class);
        intent2 = new Intent(this, MainActivity3.class);
    }


    public void home1(View view) {
        if (view.getId() == R.id.imageView8) {
            startActivity(intent);
        }
    }

    public void about1(View view) {
        if (view.getId() == R.id.about2) {
            startActivity(intent1);

        }
    }

    public void ser1(View view) {
        if (view.getId() == R.id.servv2) {
            startActivity(intent2);
        }
    }

    public void con1(View view) {
        if (view.getId() == R.id.con2) {
            startActivity(intent3);
        }
    }
}