package com.girin.shareaccountbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener((View view) -> doIntentMainActivity());
    }

    public void doIntentMainActivity() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void saveLoginInfoInSharedPreferences(String id, String pw) {
        SharedPreferences sf = getSharedPreferences("login", MODE_PRIVATE);
        SharedPreferences.Editor editor = sf.edit();
        editor.putString("id", id);
        editor.putString("pw", pw);
        editor.putBoolean("autoLoginCheck", true);
    }


    /**
     * 1. 아이디 비밀번호를 입력한다.
     * 2. 로그인을 누른다
     * 3. ID, PW 일치 여부를 확인한다.
     * 4. if 맞을 경우 -> 자동로그인 옵션 체크 여부에 따라 저장 후 메인페이지로 이동한다
     * 5. else 틀릴 경우 -> 사용자에게 틀렸다는 것을 알려준다.
     * */
}
