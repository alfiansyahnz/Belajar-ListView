package com.belanja;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final ListView listView = (ListView) findViewById(R.id.lv_1);
        String nama [] = {"Baju" , "Celana" ,"Jaket" , "Topi"};
        String detail [] = {"Merk Terbaru , ORIGINAL , LOCAL PRIDE","Merk baru , KW 10 , LOCAL PRIDE","Merk Terbaru , KW 5 , Luar PRIDE","Merk Terbaru , KW 2 , LOCAL PRIDE"};
        int gambar [] = {R.drawable.baju,R.drawable.celana,R.drawable.jaket,R.drawable.topi};
        ListDetailActivity adapter = new ListDetailActivity(nama,detail,gambar, this);
        listView.setAdapter(adapter);
    }
}
