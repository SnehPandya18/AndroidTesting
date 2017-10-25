package com.snehpandya.androidtesting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by sneh.pandya on 25/10/17.
 */

public class FragmentActivity extends AppCompatActivity {

    private Button mButton;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentOne fragmentOne = new FragmentOne();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_frame, fragmentOne).commit();

        mButton = (Button) findViewById(R.id.change_fragment);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                mFragmentTransaction.replace(R.id.fragment_frame, new FragmentTwo()).commit();
                mButton.setVisibility(View.GONE);
            }
        });
    }
}
