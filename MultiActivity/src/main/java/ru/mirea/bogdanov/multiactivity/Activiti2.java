package ru.mirea.bogdanov.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activiti2 extends AppCompatActivity {
    private TextView A1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiti2);
        String text = (String) getIntent().getSerializableExtra("key");
        A1=findViewById(R.id.textView);
        A1.setText(text);
    }

}