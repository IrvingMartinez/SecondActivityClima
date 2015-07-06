package com.example.irvingmartinez.clima;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by IRVINGMARTINEZ on 05/06/2015.
 */
public class Adapter extends BaseAdapter {

    private ArrayList<Data> Data;
    private LayoutInflater inflater;
    Context contexto;

    public Adapter(ArrayList<Data> cat,Context con)
    {
        this.Data=cat;
        inflater=LayoutInflater.from(con);
        this.contexto=con;

    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Object getItem(int position) {
        return Data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflater.inflate(R.layout.list_item_forescast,null);
        Data cat=Data.get(position);
        ImageView img = (ImageView) convertView.findViewById(R.id.imagen);
        TextView dia = (TextView) convertView.findViewById(R.id.dia);
        TextView tiempo = (TextView) convertView.findViewById(R.id.grados);

        img.setImageDrawable(contexto.getResources().getDrawable(cat.getImagen()));

        dia.setText(cat.getDia());
        tiempo.setText(cat.getTiempo());

        return convertView;
    }
}
