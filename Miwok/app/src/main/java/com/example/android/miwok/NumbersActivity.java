package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

//import static com.example.android.miwok.R.id.rootView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //TODO: Add Words here
//        Creating ArrayList of Strings
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getResources().getString(R.string.eng_1), getResources().getString(R.string.miwok_1), R.drawable.number_one));
        words.add(new Word(getResources().getString(R.string.eng_2), getResources().getString(R.string.miwok_2), R.drawable.number_two ));
        words.add(new Word(getResources().getString(R.string.eng_3), getResources().getString(R.string.miwok_3), R.drawable.number_three));
        words.add(new Word(getResources().getString(R.string.eng_4), getResources().getString(R.string.miwok_4), R.drawable.number_four));
        words.add(new Word(getResources().getString(R.string.eng_5), getResources().getString(R.string.miwok_5), R.drawable.number_five));
        words.add(new Word(getResources().getString(R.string.eng_6), getResources().getString(R.string.miwok_6), R.drawable.number_six));
        words.add(new Word(getResources().getString(R.string.eng_7), getResources().getString(R.string.miwok_7), R.drawable.number_seven));
        words.add(new Word(getResources().getString(R.string.eng_8), getResources().getString(R.string.miwok_8), R.drawable.number_eight));
        words.add(new Word(getResources().getString(R.string.eng_9), getResources().getString(R.string.miwok_9), R.drawable.number_nine));
        words.add(new Word(getResources().getString(R.string.eng_10), getResources().getString(R.string.miwok_10), R.drawable.number_ten));

//        The Adapter shows how to create list of Items in every View
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}