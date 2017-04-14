package com.app.first.onclickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View v) {

        if (v.getId() == R.id.Button1) {
            Log.d("Akhil", "Button1 clicked");
        }

        if(v.getId()==R.id.Button2){

            Log.d("Akhil","Button2 clicked");

        }

    }
}