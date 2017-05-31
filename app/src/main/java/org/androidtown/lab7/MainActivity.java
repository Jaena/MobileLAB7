package org.androidtown.lab7;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer1;
    MediaPlayer mediaPlayer2;
    int playbackPosition = 0;

    LinearLayout linearLayout;
    RelativeLayout m1;
    RelativeLayout m2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.activity_main);

        mediaPlayer1 = new MediaPlayer();

        mediaPlayer2 = new MediaPlayer();

        m1 = (RelativeLayout) findViewById(R.id.audio1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.setBackgroundColor(Color.GRAY);
                m2.setBackgroundColor(Color.WHITE);
                    //if(mediaPlayer1.isPlaying())
                        mediaPlayer1.release();
                    //if(mediaPlayer2.isPlaying())
                        mediaPlayer2.release();
                    mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.music1);
                    mediaPlayer1.start();
                    Toast.makeText(getApplicationContext(),"음악 1을 재생합니다",Toast.LENGTH_SHORT).show();
            }
        });
        m2 = (RelativeLayout) findViewById(R.id.audio2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.setBackgroundColor(Color.GRAY);
                m1.setBackgroundColor(Color.WHITE);
                //if(mediaPlayer2.isPlaying())
                    mediaPlayer2.release();
                //if(mediaPlayer1.isPlaying())
                    mediaPlayer1.release();
                mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.music2);
                mediaPlayer2.start();
                    Toast.makeText(getApplicationContext(),"음악 2를 재생합니다",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
