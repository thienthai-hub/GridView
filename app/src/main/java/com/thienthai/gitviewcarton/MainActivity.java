package com.thienthai.gitviewcarton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    ArrayList<Carton> cartonArrayList;
    hinhadapter hinhadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (GridView) findViewById(R.id.gvShow);
        cartonArrayList = new ArrayList<>();
        cartonArrayList.add(new Carton("i love you",R.drawable.nv2));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv11));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv4));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv3));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv2));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv11));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv4));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv3));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv2));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv11));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv4));
        cartonArrayList.add(new Carton("i love you",R.drawable.nv3));
        hinhadapter = new hinhadapter(this, R.layout.gid_dong_imge,cartonArrayList);
        gv.setAdapter(hinhadapter);

    }
}