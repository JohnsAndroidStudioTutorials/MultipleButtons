package com.sartainstudios.multiplebuttons;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.toast_button).setOnClickListener(buttonClickListener);
        findViewById(R.id.sound_button).setOnClickListener(buttonClickListener);
        findViewById(R.id.image_button).setOnClickListener(buttonClickListener);
        findViewById(R.id.new_activity_button).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.toast_button:
                    Toast.makeText(MainActivity.this, "Johns Android Studio Tutorials", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.sound_button:
                    MediaPlayer johnsTutorialsAreBest = MediaPlayer.create(getApplicationContext(), R.raw.tutorials_best);
                    johnsTutorialsAreBest.start();
                    break;
                case R.id.image_button:
                    startActivity(new Intent(MainActivity.this, Image.class));
                    break;
                case R.id.new_activity_button:
                    Intent AboutMalts = new Intent(MainActivity.this, Info.class);
                    startActivity(AboutMalts);
                    break;
            }
        }
    };
}