package com.example.irvingmartinez.clima;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by IRVINGMARTINEZ on 05/06/2015.
 */
public class SecondActivity  extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        ImageView imageView = (ImageView) findViewById(R.id.imagen);
        TextView dia = (TextView) findViewById(R.id.dia);
        TextView tiempo = (TextView) findViewById(R.id.tiempo);

        Bundle bd= getIntent().getExtras();
        int photo = bd.getInt("imagen");
        String day = bd.getString("dia");
        String climb = bd.getString("tiempo");

        imageView.setImageResource(photo);
        dia.setText(day);
        tiempo.setText(climb);


    }


}
