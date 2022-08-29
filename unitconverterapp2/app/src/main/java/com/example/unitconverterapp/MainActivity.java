package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView3;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        editText1 = findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
//              Toast.makeText(MainActivity.this, "hii ji", Toast.LENGTH_SHORT).show();
              String s = editText1.getText().toString();
              int kg = Integer.parseInt(s);
              double pound =2.205 + kg;
              textView3.setText("Above value in Pound is = "+ pound);

          }
        });
    }
}