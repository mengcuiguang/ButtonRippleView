package com.meng.buttonrippleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimationButton abt1 = (AnimationButton) findViewById(R.id.abt1);
        abt1.setonClickAnimListener(new AnimationButton.ClickAnimListener() {
            @Override
            public void clickAnimComplete() {
                Toast.makeText(MainActivity.this, "波纹结束，我执行", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
