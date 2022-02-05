package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("Red", "wetetti", R.drawable.color_red));
        word.add(new Word("Green", "chokokki",R.drawable.color_green));
        word.add(new Word("Brown", "takakki",R.drawable.color_brown));
        word.add(new Word("Gray", "topoppi",R.drawable.color_gray));
        word.add(new Word("Black", "kululli",R.drawable.color_black));
        word.add(new Word("White", "kelelli", R.drawable.color_white));
        word.add(new Word("Dusty Yellow", "topiise", R.drawable.color_dusty_yellow));
        word.add(new Word("Mustard Yellow", "chiwitte", R.drawable.color_mustard_yellow));

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.audio_color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow,
                R.raw.audio_color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow,
                R.raw.audio_color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.audio_color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.audio_color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.audio_color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black, R.raw.audio_color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.audio_color_white));


        WordAdapter adapter =
                new WordAdapter(this,  word, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });

    }
}