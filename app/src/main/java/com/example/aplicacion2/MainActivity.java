package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sonido;
    ImageButton btnSonido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSonido = (ImageButton) findViewById(R.id.btnSonido);
        sonido = MediaPlayer.create(this ,R.raw.music);
        btnSonido.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                sonido.start();
            }

        });

    }
}