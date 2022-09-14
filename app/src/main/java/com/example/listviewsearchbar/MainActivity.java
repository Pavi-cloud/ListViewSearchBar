package com.example.listviewsearchbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView=findViewById(R.id.searchBar);
        listView=findViewById(R.id.listView);
        arrayList=new ArrayList<>();

        arrayList.add("Pavitra");
        arrayList.add("Tripathi");
        arrayList.add("Satyam");
        arrayList.add("Tewari");
        arrayList.add("Rajat");
        arrayList.add("Pandey");
        arrayList.add("Shubham");
        arrayList.add("Tewari");
        arrayList.add("Sagar");
        arrayList.add("Tripathi");
        arrayList.add("Mahendra");
        arrayList.add("Singh");
        arrayList.add("Dhoni");
        arrayList.add("Virat");
        arrayList.add("Kohli");
        arrayList.add("Rohit");
        arrayList.add("Sharma");
        arrayList.add("Sachin");
        arrayList.add("Tendulkar");
        arrayList.add("AB Devillers");
        arrayList.add("DE Cock");
        arrayList.add("David");
        arrayList.add("Warner");
        arrayList.add("Trend");
        arrayList.add("Bolt");

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if(arrayList.contains(s)){
                    adapter.getFilter().filter(s);
                }
                else{
                    Toast.makeText(MainActivity.this, "No Output is Present", Toast.LENGTH_SHORT).show();
                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
}