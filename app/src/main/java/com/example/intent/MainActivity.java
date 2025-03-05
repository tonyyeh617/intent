package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button homeBt1, homeBt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //按鈕事件
        homeBt1 = findViewById(R.id.homeBt1);
        homeBt2 = findViewById(R.id.homeBt2);
        homeBt1.setOnClickListener(new homeBtOnClickListener());
        homeBt2.setOnClickListener(new homeBtOnClickListener());
    }

    private class homeBtOnClickListener implements View.OnClickListener {
        Intent intent = new Intent();
        @Override
        public void onClick(View v) {
//            Log.d("msg_show","button");
            if (v.getId()==R.id.homeBt1){
//                Log.d("msg_show","button1");
                intent.setClass(MainActivity.this, ActivityPage1.class);
                startActivity(intent);
            }else if (v.getId()==R.id.homeBt2){
//                Log.d("msg_show","button2");
                intent.setClass(MainActivity.this, ActivityPage2.class);
                startActivity(intent);
            }
        }
    }
}