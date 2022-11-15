package com.example.containmentzonedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button Register;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Register = findViewById(R.id.button2);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }

        });
        intent = new Intent(this, forgotpassord.class);
    }

    public void signin1(View view) {
        if (view.getId()==R.id.textView12)
        {
            finish();
        }
    }

    public void ot(View view) {
        if (view.getId() == R.id.textView8) {
            startActivity(intent);
        }
    }
}