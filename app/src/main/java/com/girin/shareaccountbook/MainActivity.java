package com.girin.shareaccountbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DB에서 사용자 기록 불러오기
            // if 사용자의 DB 기록이 업을 경우

            // 사용자의 퍼미션을 받아야한다.
            // 필요한 퍼미션 ? 메시지 스캔하기
            // if  사용자가 퍼미션을 허락한경우
            // else 사용자가 퍼미션을 허락하지 않은 경우

            // 최초 메시지에서 스캔해오기

        // 사용자의 기록 불러올 때 공유 받은 정보까지 같이 조회하기

        // 화면에 뿌려주기
    }
}
