package com.example.hp.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Initializing values or contact names in the array
     String[] name={"Nitish","Bhawani","Mithun", "Zeenat", "Vishwas"};

    //Initializing values or phone numbers in the array
     String[] phone={"9898134567","9378453678","87303484458","9999345678","88834234570"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Creating and initializing list view object by id
        ListView listView = (ListView)findViewById(R.id.CustomActivity);

        /* setAdapter () method sets a custom adapter as the source for all items that is to be
        displayed in the GridView.
         */
        listView.setAdapter(new CustomAdapter(this,name,phone));
    }


}
