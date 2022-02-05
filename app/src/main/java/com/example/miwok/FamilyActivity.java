package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word("father","epe",R.drawable.family_father));
        word.add(new Word("mother","eta",R.drawable.family_mother));
        word.add(new Word("son","angsi", R.drawable.family_son));
        word.add(new Word("daughter","tune", R.drawable.family_daughter));
        word.add(new Word("older brother","taachi", R.drawable.family_older_brother));
        word.add(new Word("Younger brother","chalitti", R.drawable.family_younger_brother));
        word.add(new Word("Older Sister","tete", R.drawable.family_older_sister));
        word.add(new Word("Younger Sister","kolliti",R.drawable.family_younger_sister));
        word.add(new Word("Grandmother","ama",R.drawable.family_grandmother));
        word.add(new Word("Grandfather","paapa", R.drawable.family_grandfather));

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.audio_family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.audio_family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.audio_family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.audio_family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother,
                R.raw.audio_family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother,
                R.raw.audio_family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister,
                R.raw.audio_family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister,
                R.raw.audio_family_younger_sister));
        words.add(new Word("grandmother ", "ama", R.drawable.family_grandmother,
                R.raw.audio_family_grandmother));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather,
                R.raw.audio_family_grandfather));

        WordAdapter adapter =
                new WordAdapter(this,  word, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }

    }
