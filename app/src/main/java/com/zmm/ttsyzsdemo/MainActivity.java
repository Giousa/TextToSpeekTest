package com.zmm.ttsyzsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button speek = findViewById(R.id.btn_speek);

        speek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TTSUtils.getInstance().speak("我要说话，你不要说话，我说的话好听，你说的不好听");
            }
        });
    }
}
