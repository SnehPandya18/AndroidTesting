package com.snehpandya.androidtesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sneh.pandya on 24/10/17.
 */

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;
    private CheckBox mCheckBox;

    private String text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        text = intent.getStringExtra("editText");

        mTextView = (TextView) findViewById(R.id.text_result);
        mTextView.setText(text);

        mCheckBox = (CheckBox) findViewById(R.id.checkbox_toast);
        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    Toast.makeText(SecondActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
