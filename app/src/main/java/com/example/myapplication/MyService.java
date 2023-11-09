package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyService extends Service {
    private MediaPlayer player;
    @Override
    public int onStartCommand (Intent intent, int flags, int startId) {
// to play default ringtone:
        player = MediaPlayer.create( this, Settings.System.DEFAULT_RINGTONE_URI );
// to play an audio (you need to first create new folder named "raw" in "res" folder and put your audio there: player = MediaPlayer.create(getApplicationContext(), R.raw.rain);
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
    @Override
    public IBinder onBind(Intent intent) { return null; }
}


