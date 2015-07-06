package com.example.irvingmartinez.clima;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;import com.example.irvingmartinez.clima.R;

/**
 * Created by IRVINGMARTINEZ on 05/06/2015.
 */
public class Data {

    private String dia;
    private String tiempo;
    private int imagen;

    public Data(String dia, String tiempo, int imagen) {
        this.dia = dia;
        this.tiempo = tiempo;
        this.imagen = imagen;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }



}
