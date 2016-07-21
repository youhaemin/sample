package com.example.user.useraccount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//로그인 버틍늘 입력하면 입력된아이디와 비밀번호를 얻어와 토스트로 출력

public class MainActivity extends AppCompatActivity {

    EditText id;
    EditText pwd;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = (EditText) findViewById(R.id.id);
        pwd = (EditText) findViewById(R.id.pwd);
    }

    public void onClick_login(View v) {
        Intent i = new Intent(this, SubActivity.class);
        startActivity(i);
    }
}