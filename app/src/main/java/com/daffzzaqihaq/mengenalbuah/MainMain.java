package com.daffzzaqihaq.mengenalbuah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainMain extends AppCompatActivity {


    @BindView(R.id.btnEnter)
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnEnter)
    public void onViewClicked() {
        Intent pindah = new Intent(MainMain.this, MainActivity.class);
        startActivity(pindah);
    }
}
