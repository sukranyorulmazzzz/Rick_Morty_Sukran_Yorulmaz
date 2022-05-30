package com.example.rickandmortybysukranyorulmaz.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.example.rickandmortybysukranyorulmaz.R;

public class MainActivity extends AppCompatActivity {

    ImageView rickAndMortyText;
    Handler handler;
    MediaPlayer mediaPlayer;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rickAndMortyText=findViewById(R.id.rickAndMortyText);
        lottieAnimationView=findViewById(R.id.mortylottie);

         lottieAnimationView.animate().setDuration(5000).translationX(1500);
         rickAndMortyText.animate().setDuration(5000).scaleX(80).scaleY(80);
        mediaPlayer=MediaPlayer.create(this,R.raw.opening);
        mediaPlayer.start();
            handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            },5000);
    }

}