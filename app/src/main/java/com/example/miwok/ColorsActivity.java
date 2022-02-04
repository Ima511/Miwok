package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

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


        WordAdapter adapter =
                new WordAdapter(this,  word, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}