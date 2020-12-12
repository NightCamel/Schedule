package ru.maxfad.myraspisanie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4 =(Button)findViewById(R.id.button4);
        button5 =(Button)findViewById(R.id.button5);
        button6 =(Button)findViewById(R.id.button6);

        button1.setOnClickListener(new OnClickListener() {
          @Override
           public void onClick(View v) {
             //   Toast.makeText(getBaseContext(),"Класс 11",Toast.LENGTH_SHORT).show();
              Intent intent = new Intent();
              intent.setClass(MainActivity.this, Main11Activity.class);
              Bundle b = new Bundle();
              b.putString("classID", "830501");
              intent.putExtras(b);
              startActivity(intent);
          }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getBaseContext(),"Класс 10",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "834201");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(),"Класс 9",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "833701");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(),"Класс 8",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "833702");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(),"Класс 7",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "010291");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getBaseContext(),"Класс 6",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "910291");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}