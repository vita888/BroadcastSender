package com.example.vita.broadcastsender;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.vita.broadcastnotification1");
                //intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                Bundle bd = new Bundle();
                bd.putString("name","开启了一个全局广播");
                intent.putExtras(bd);
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
