package com.example.ben.datainput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToggle(View view) {

        Switch sw = (Switch) view;

        View btn = this.findViewById(R.id.uxBtnOk);
        btn.setEnabled(sw.isChecked());

    }
}
