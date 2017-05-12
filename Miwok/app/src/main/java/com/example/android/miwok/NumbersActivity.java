package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

//import static com.example.android.miwok.R.id.rootView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //TODO: Add Words here
//        Creating ArrayList of Strings
        ArrayList<String> words = new ArrayList<String>();
        words.add(getResources().getString(R.string.eng_1));
        words.add(getResources().getString(R.string.eng_2));
        words.add(getResources().getString(R.string.eng_3));
        words.add(getResources().getString(R.string.eng_4));
        words.add(getResources().getString(R.string.eng_5));
        words.add(getResources().getString(R.string.eng_6));
        words.add(getResources().getString(R.string.eng_7));
        words.add(getResources().getString(R.string.eng_8));
        words.add(getResources().getString(R.string.eng_9));
        words.add(getResources().getString(R.string.eng_10));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);


//        For Loop example
//        for (int i = 0; i < words.size(); i++){
//
//            // Find the root view so we can add child views to it
//            LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.setText(words.get(i));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//        }
    }
}