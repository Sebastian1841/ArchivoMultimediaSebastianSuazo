package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView Mivideito = findViewById(R.id.videito);

        String videito = "android.resource://"+ getPackageName()+"/"+R.raw.her;

        Uri uri = Uri.parse(videito);
        Mivideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(Mivideito);
        Mivideito.setMediaController(mediaController);
    }
}