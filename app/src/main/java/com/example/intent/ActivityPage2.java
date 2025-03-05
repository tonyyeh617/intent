package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityPage2 extends AppCompatActivity {
    private Button page2Bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.page2Main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        page2Bt1 = findViewById(R.id.page2Bt1);
        page2Bt1.setOnClickListener(new page2Bt1OnClickListener());
    }

    private class page2Bt1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(ActivityPage2.this, MainActivity.class);
            startActivity(intent);
        }
    }
}