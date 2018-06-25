package com.example.irhabi.contohbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button btnMerah, btnBiru, btnUngu, btnHijau, btnOranye, btnHitam;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMerah = (Button) findViewById(R.id.buttonMerah);
        btnMerah.setOnClickListener(this);
        btnBiru = (Button) findViewById(R.id.buttonBiru);
        btnBiru.setOnClickListener(this);
        btnUngu = (Button) findViewById(R.id.buttonUngu);
        btnUngu.setOnClickListener(this);
        btnHijau = (Button) findViewById(R.id.buttonHijau);
        btnHijau.setOnClickListener(this);
        btnOranye = (Button) findViewById(R.id.buttonOranye);
        btnOranye.setOnClickListener(this);
        btnHitam = (Button) findViewById(R.id.buttonHitam);
        btnHitam.setOnClickListener(this);
        imageview = (ImageView) findViewById(R.id.imageView1);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonMerah:
                imageview.setBackgroundColor(getResources().getColor(R.color.red));
                return;
            case R.id.buttonBiru:
                imageview.setBackgroundColor(getResources().getColor(R.color.blue));
                return;
            case R.id.buttonUngu:
                imageview.setBackgroundColor(getResources().getColor(R.color.purple));
                return;
            case R.id.buttonHijau:
                imageview.setBackgroundColor(getResources().getColor(R.color.green));
                return;
            case R.id.buttonOranye:
                imageview.setBackgroundColor(getResources().getColor(R.color.orange));
                return;
            case R.id.buttonHitam:
                imageview.setBackgroundColor(getResources().getColor(R.color.black));
                return;
        }
    }
}
