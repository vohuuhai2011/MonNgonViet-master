package com.example.ka.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ActivityB extends AppCompatActivity implements OnItemClickListener,OnItemLongClickListener {
    private ListView Lv;
    private ArrayList<String> List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_b);
        Lv= (ListView) findViewById(R.id.Lv);
        List =new ArrayList<String>();
        List.add("Sinh Tố & Giải Khát");
        List.add("Món Khai Vị");
        List.add("Món Kho");
        List.add("Khác");
        List.add("Món Nướng");
        List.add("Món Gỏi");
        List.add("Món Xào");
        List.add("Món Hầm");
        List.add("Món Chiên");
        List.add("Món Canh");
        List.add("Món Chay");
        List.add("Món Cơm");
        List.add("Món Cuốn");
        List.add("Món Cháo");
        List.add("Món Bánh");
        List.add("Món Cẩm");
        List.add("Món Chè");
        List.add("Món Hấp");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, List);
        Lv.setAdapter(adapter);
        Lv.setOnItemClickListener(this);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        if(id==R.id.action_search) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, List.get(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        return false;
    }
}
