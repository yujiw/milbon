package com.example.dialmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

    //画面のレイアウト設定
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //「電話をかける」ボタンの処理
    public void onClick_TelButton(View target){
        Intent intent = new Intent(this, Dial.class);
        startActivity(intent);
    }

    //「終了」ボタンの処理
    public void onClick_ExitButton(View target){
        finish();
    }

}