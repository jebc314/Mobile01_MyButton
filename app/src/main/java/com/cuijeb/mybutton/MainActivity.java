package com.cuijeb.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button increase_button;
    private Button decrease_button;
    private Button color_button;
    private Button double_button;

    private TextView textView;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase_button = findViewById(R.id.increase_button);
        decrease_button = findViewById(R.id.decrease_button);
        color_button = findViewById(R.id.color_button);
        double_button = findViewById(R.id.double_button);
        textView = findViewById(R.id.textView);
        if (textView != null)
        {
            count = Integer.parseInt(textView.getText().toString());
        }

        increase_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count++;
                textView.setText(""+count);
            }
        });
        decrease_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count--;
                textView.setText(""+count);
            }
        });
        color_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.rgb((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
            }
        });
        double_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count*=2;
                textView.setText(""+count);
            }
        });
    }
}