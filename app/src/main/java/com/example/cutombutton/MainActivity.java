package com.example.cutombutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button custombutton = findViewById(R.id.custom_button);
        Switch enableSwitch = findViewById(R.id.enable_button);

        custombutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });


        enableSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    custombutton.setEnabled(true);
                }
                else {
                    custombutton.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Button disabled", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
