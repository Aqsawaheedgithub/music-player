package com.example.playpausestop;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button clk1,clk2,clk3;
  MediaPlayer mdx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk1 = (Button)findViewById(R.id.playid);
        clk2 = (Button)findViewById(R.id.pauseid);
        clk3 = (Button)findViewById(R.id.stopid);
        mdx = MediaPlayer.create(MainActivity.this,R.raw.music);
    }
    public void clkplay(View view)
    {
        mdx.start();
    }
    public void clkpause(View view)
    {

        mdx.pause();
    }
    public void clkstop(View view)
    {
        mdx.stop();
        mdx = MediaPlayer.create(MainActivity.this,R.raw.music);
    }
}