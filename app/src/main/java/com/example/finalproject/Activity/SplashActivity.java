package com.example.finalproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.finalproject.R;


public class SplashActivity extends BaseActivity {

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {

            @Override
            public void run() {

                //설명 팝업창 띠우기
                sp = getSharedPreferences("PBL",MODE_PRIVATE);
                boolean repeat = sp.getBoolean("popup",true);

                startActivity(new Intent(getBaseContext(), MainActivity.class));

                if(repeat == true){
                    startActivity(new Intent(getBaseContext(), PopupActivity.class));
                }

                finish();
                // 3 초후 이미지를 닫아버림
            }
        }, 3000);
    }
}
