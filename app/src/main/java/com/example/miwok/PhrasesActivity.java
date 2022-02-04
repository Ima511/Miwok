package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<>();
        word.add(new Word("Where are you going?","minto wuksus"));
        word.add(new Word("what is your name", "tinne oyasse'ne"));
        word.add(new Word("My name is .......", "oyasset"));
        word.add(new Word("How are you feeling?", "michekses"));
        word.add(new Word("I'm feeling good","kuchi achit"));
        word.add(new Word("Are you coming ?","eenes'aa?"));
        word.add(new Word("Yes, I'm coming ","hee' eenem"));
        word.add(new Word("Let's go","yoowutis"));
        word.add(new Word("Come here?","anni'nem"));


        WordAdapter adapter =
                new WordAdapter(this,  word, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}