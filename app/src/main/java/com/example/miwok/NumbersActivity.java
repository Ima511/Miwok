package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

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





    }


}