package com.example.akashkumar.gkv1;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

import static com.google.android.youtube.player.YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION;

public class Gkvvideo extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gkvvideo);

        play=findViewById(R.id.play);

        mYouTubePlayerView=findViewById(R.id.youtube);




        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {







                       /* youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION
                                | YouTubePlayer.FULLSCREEN_FLAG_CONTROL_SYSTEM_UI
                                | YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE
                                | YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);*/
                        youTubePlayer.setShowFullscreenButton(false);



                        youTubePlayer.loadVideo("Ahb_NJmCxR0");




                    }



                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                };


                mYouTubePlayerView.initialize(YouTubeconfig.getApiKey(),mOnInitializedListener);

            }


        });
    }
}
