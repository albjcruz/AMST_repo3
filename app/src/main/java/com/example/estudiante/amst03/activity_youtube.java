package com.example.estudiante.amst03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class activity_youtube extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlaybackEventListener {
    String ClaveYoutube= "AIzaSyA8UisTh-7X3lDS6BQEgE-hRXb_f5JlRB8";
    YouTubePlayerView youTubePlayerView;
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        youTubePlayerView= (YouTubePlayerView)findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(ClaveYoutube,this);
     }



    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean fueRestaurado) {
         if(!fueRestaurado){
             youTubePlayer.cueVideo("OEcBz6VtyDg");
         }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
    if(youTubeInitializationResult.isUserRecoverableError()){
        youTubeInitializationResult.getErrorDialog(this,1).show();
    }else{
        String error = "Error al inicializar Youtube" + youTubeInitializationResult.toString();
        Toast.makeText(getApplication(),error,Toast.LENGTH_LONG).show();
    }
    }

    protected void onActivityResult(int requestCode, int resultcode, Intent data){
         if(resultcode==1){
             getYoutubePlayerProvider().initialize(ClaveYoutube,this);
         }
    }

    protected  YouTubePlayer.Provider getYoutubePlayerProvider(){
         return youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}
