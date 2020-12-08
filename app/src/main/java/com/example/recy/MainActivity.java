package com.example.recy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recy.modelcla.Recyclemodel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.showdata);
        ArrayList<Recyclemodel> list=new ArrayList<>();
        list.add(new Recyclemodel(R.drawable.tou1,"Indiana"));
        list.add(new Recyclemodel(R.drawable.tou2,"Indiana"));
        list.add(new Recyclemodel(R.drawable.tou3,"Indiana"));
        list.add(new Recyclemodel(R.drawable.tou4,"Indiana"));
        list.add(new Recyclemodel(R.drawable.tou5,"Indiana"));
        list.add(new Recyclemodel(R.drawable.tou6,"Indiana"));
        list.add(new Recyclemodel(R.drawable.tou7,"Indiana"));
        list.add(new Recyclemodel(R.drawable.tou8,"Indiana"));

        Recylercod recylercod=new Recylercod(list,this);
        recyclerView.setAdapter(recylercod);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

    }
}
