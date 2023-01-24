package com.dev.myappcompany.timestables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar timesTablesSeekBar = findViewById(R.id.seekBar);

        ListView myListView = findViewById(R.id.myListView);

        timesTablesSeekBar.setMax(15);
        timesTablesSeekBar.setProgress(5);

        timesTablesSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                int timesTableNumber;

                if (progress < min) {
                    timesTableNumber = min;
                    timesTablesSeekBar.setProgress(min);
                } else {
                    timesTableNumber = progress;
                }
                Log.i("Seekbar value: ", Integer.toString(timesTableNumber));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

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
        companies.add("Mercedes-Benz");
        companies.add("BMW");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, companies);

        myListView.setAdapter(arrayAdapter);



    }
}
