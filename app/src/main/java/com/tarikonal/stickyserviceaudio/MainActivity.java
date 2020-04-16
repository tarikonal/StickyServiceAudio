package com.tarikonal.stickyserviceaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void stop(View view) {
        Intent intent = new Intent(this,StickyService.class);
        stopService(intent);
    }

    public void play(View view) {
        //Uri uri ;

        //mediaPlayer = MediaPlayer.create(this, Uri.parse(Environment.getExternalStorageDirectory().getPath()+ "/Music/intro.mp3"))
        Intent intent = new Intent(this,StickyService.class);
        startService(intent);
    }
}
