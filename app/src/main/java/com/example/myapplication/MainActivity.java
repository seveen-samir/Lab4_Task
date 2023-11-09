package com.example.myapplication;
import android.app.DownloadManager; import android.content.Context; import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore; import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button start, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.start); stop = (Button) findViewById(R.id.stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    public void onClick(View view) {
        if(view== start){

        startService(new Intent( this,MyService.class));}
        else if (view == stop){
            stopService(new Intent(this, MyService.class));
        }}}