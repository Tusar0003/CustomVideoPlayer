package com.example.anagramchecker.activity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.anagramchecker.R;
import com.example.anagramchecker.adapter.VideoAdapter;
import com.example.anagramchecker.fragment.VideoFragment;
import com.example.anagramchecker.fragment.VideoListFragment;
import com.example.anagramchecker.model.Video;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_main, new VideoListFragment())
                .commit();
    }
}
