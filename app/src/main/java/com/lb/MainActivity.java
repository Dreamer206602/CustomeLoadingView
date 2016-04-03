package com.lb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.roger.catloadinglibrary.CatLoadingView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    private CatLoadingView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mView=new CatLoadingView();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mView.show(getSupportFragmentManager(),"");
            }
        });
    }
}
