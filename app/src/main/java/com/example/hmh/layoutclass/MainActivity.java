package com.example.hmh.layoutclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  hello= (Button) findViewById(R.id.button);
        Button  linear= (Button) findViewById(R.id.button2);
        Button  relative= (Button) findViewById(R.id.button3);
        Button  table= (Button) findViewById(R.id.button4);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),HelloWorld.class);
                startActivity(intent);
            }
        });

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),LinearLayout.class);
                startActivity(intent);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),RelativeLayout.class);
                startActivity(intent);
            }
        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TableLayout.class);
                startActivity(intent);
            }
        });
    }
}
