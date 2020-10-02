package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ListView listView;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person(R.drawable.h1,"SuYi", "Imposter"));
        arrayList.add(new Person(R.drawable.h2,"Dia", "Creamate"));
        arrayList.add(new Person(R.drawable.h3,"VietCong", "Creamate"));
        arrayList.add(new Person(R.drawable.h4,"Cai Cay", "Creamate"));
        arrayList.add(new Person(R.drawable.h5,"Ty", "Creamate"));
        arrayList.add(new Person(R.drawable.h6,"NoWay", "Creamate"));
        arrayList.add(new Person(R.drawable.h7,"Linhh", "Imposter"));
        arrayList.add(new Person(R.drawable.h8,"Moon", "Creamate"));
        arrayList.add(new Person(R.drawable.h9,"Its not me", "Creamate"));
        arrayList.add(new Person(R.drawable.h10,"zzzzz", "Creamate"));

        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(personAdapter);
        }
}