package com.tanamo.knust.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.tanamo.knust.R;


// This is my launcher class.
public class Flash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.flash);

        Handler handler = new Handler();


        // Run a thread after 5 Sec.
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                finish();
                Intent intent = new Intent(Flash.this, MainActivity.class);
                Flash.this.startActivity(intent);

            }


            // time in milliseconds (1 second = 1000 milliseconds)

        }, 5000);


    }

}
