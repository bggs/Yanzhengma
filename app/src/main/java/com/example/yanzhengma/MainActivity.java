package com.example.yanzhengma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/**
*@Author Administrator
* @Date 2017/9/27
 * 验证码
*/
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AuthCodeView mAuthCodeView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mAuthCodeView = (AuthCodeView) findViewById(R.id.AuthCodeView);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                EditText editText = (EditText) findViewById(R.id.editText);
                String codeString = editText.getText().toString().trim();
                if (codeString.equals(mAuthCodeView.getAuthCode())) {
                    Toast.makeText(this, "恭喜你,验证码验证正确！", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "验证码错误！", Toast.LENGTH_LONG).show();
                }
                break;
        }

    }
}
