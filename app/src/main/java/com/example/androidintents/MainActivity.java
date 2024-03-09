package com.example.androidintents;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText txtName;
    Button btnActivity;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        btnActivity = findViewById(R.id.btnActivity);

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = txtName.getText().toString();
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                myIntent.putExtra("NAME", name);
                startActivity(myIntent);
            }
        });

    }
}