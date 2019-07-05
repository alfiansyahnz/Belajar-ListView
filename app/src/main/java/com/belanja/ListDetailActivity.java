package com.belanja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListDetailActivity extends BaseAdapter{
    String nama[];
    String detail[];
    int gambar[];
    Context context;
    LayoutInflater inflater;

    public ListDetailActivity(String[] nama, String[] detail, int[] gambar, Context context) {
        this.nama = nama;
        this.gambar = gambar;
        this.detail = detail;
        this.context = context;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_list_detail, viewGroup, false);
        TextView txtNama = (TextView) view.findViewById(R.id.tv_nama);
        TextView txtDetail = (TextView) view.findViewById(R.id.tv_detail);
        ImageView img = (ImageView) view.findViewById(R.id.iv_logo);


        txtNama.setText(nama[i]);
        txtDetail.setText(detail[i]);
        img.setImageResource(gambar[i]);

        return view;
    }

    @Override
    public Object getItem(int i) {
        return nama;
    }

    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}

