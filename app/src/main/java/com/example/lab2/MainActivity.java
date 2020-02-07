package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInput = findViewById(R.id.txtInput);


    }

    public void btnListener(View view) {

        Log.d("dbg",txtInput.getText().toString());

        Toast.makeText(this,txtInput.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
