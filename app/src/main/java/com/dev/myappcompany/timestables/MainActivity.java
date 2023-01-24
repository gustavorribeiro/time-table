package com.dev.myappcompany.timestables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar timesTablesSeekBar = findViewById(R.id.seekBar);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> companies = new ArrayList<String>();

        companies.add("Google");
        companies.add("Amazon");
        companies.add("Microsoft");
        companies.add("Apple");
        companies.add("Meta");
        companies.add("Netflix");
        companies.add("Spotify");
        companies.add("Samsung");
        companies.add("Tesla");
        companies.add("Space X");
        companies.add("Loft");
        companies.add("Nike");
        companies.add("Adidas");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, companies);

        myListView.setAdapter(arrayAdapter);



    }
}
