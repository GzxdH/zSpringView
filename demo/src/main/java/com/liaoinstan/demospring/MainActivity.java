package com.liaoinstan.demospring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.liaoinstan.demospring.demo1.Demo1Activity;
import com.liaoinstan.demospring.demo4.Demo4Activity;
import com.liaoinstan.demospring.demo6.Demo6Activity;
import com.liaoinstan.demospring.demo8.Demo8Activity;
import com.liaoinstan.demospring.test.TestActivity;
import com.liaoinstan.demospring.warning.WarningActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.demo1:
                intent.setClass(this, Demo1Activity.class);
                startActivity(intent);
                break;
            case R.id.demo4:
                intent.setClass(this, Demo4Activity.class);
                startActivity(intent);
                break;
            case R.id.demo6:
                intent.setClass(this, Demo6Activity.class);
                startActivity(intent);
                break;
            case R.id.demo8:
                intent.setClass(this, Demo8Activity.class);
                startActivity(intent);
                break;
            case R.id.warning:
                intent.setClass(this, WarningActivity.class);
                startActivity(intent);
                break;
            case R.id.test:
                intent.setClass(this, TestActivity.class);
                startActivity(intent);
                break;
        }
    }
}
