package com.snehpandya.androidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView;
    private EditText mEditText;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text_hello);
        mEditText = (EditText) findViewById(R.id.et_hello);
        mButton1 = (Button) findViewById(R.id.btn_next);
        mButton2 = (Button) findViewById(R.id.btn_activity);
        mButton3 = (Button) findViewById(R.id.btn_fragment);
        mButton4 = (Button) findViewById(R.id.btn_listview);
        mButton5 = (Button) findViewById(R.id.btn_recyclerview);

        mTextView.setText("Hello Android!");
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_next:
                checkEditText();
                break;
            case R.id.btn_activity:
                Intent intent1 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_fragment:
                Intent intent2 = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_listview:
                Intent intent3 = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_recyclerview:
                Intent intent4 = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent4);
                break;
        }
    }

    private void checkEditText() {
        if (!TextUtils.isEmpty(mEditText.getText())) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("editText", mEditText.getText().toString());
            startActivity(intent);
        }
    }
}