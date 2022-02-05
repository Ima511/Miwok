package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


       ArrayList<Word> word = new ArrayList<Word>();

        word.add(new Word("One", "lutti", R.drawable.number_one));
        word.add(new Word("Two","ottiko", R.drawable.number_two));
        word.add(new Word("Three", "toloolosu", R.drawable.number_three));
        word.add(new Word("Four", "oyissa", R.drawable.number_four));
        word.add(new Word("Five", "massokka", R.drawable.number_five));
        word.add(new Word("Six", "temmokka", R.drawable.number_six));
        word.add(new Word("Seven", "kenekaku", R.drawable.number_seven));
        word.add(new Word("Eight","kawinta", R.drawable.number_eight));
        word.add(new Word("Nine","wo'e", R.drawable.number_nine));
        word.add(new Word("Ten", "na'aacha", R.drawable.number_ten));

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.audio_number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.audio_number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.audio_number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.audio_number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.audio_number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.audio_number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.audio_number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.audio_number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.audio_number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.audio_number_ten));

       /* word.add("One");
        word.add("Two");
        word.add("Three");
        word.add("Four");
        word.add("Five");
        word.add("Six");
        word.add("Seven");
        word.add("Eight");
        word.add("Nine");
        word.add("Ten");*/



        WordAdapter adapter =
                new WordAdapter(this,  word, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });









    }


}