package com.example.irvingmartinez.clima;


import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;
import java.util.ArrayList;


public class MainActivity extends Activity {

    ListView lista;
    ArrayList<Data> Data;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listado);
        Data = new ArrayList<Data>();
        Data.add(new Data("Lunes", "Nublado     24c/25c", R.drawable.nublado));
        Data.add(new Data("Martes", "Soleado    25c/27c", R.drawable.soleado));
        Data.add(new Data("Miercoles", "Lluvioso    20c/2c", R.drawable.lluvioso));
        Data.add(new Data("Jueves", "Nublado        24c/25c", R.drawable.nublado));
        Data.add(new Data("Viernes", "Soleado       25c/27c", R.drawable.soleado));
        Data.add(new Data("Sabado", "Lluvioso      20c/22c", R.drawable.lluvioso));
        Data.add(new Data("Domingo", "Nublado      24c/25c", R.drawable.nublado));


        Adapter adapter = new Adapter(Data, MainActivity.this.getApplicationContext());
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){


         @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

             Data clickedData = Data.get(position);
             Intent second = new Intent(MainActivity.this,SecondActivity.class);
             String dia = clickedData.getDia();
             String tiempo = clickedData.getTiempo();
             int photo = clickedData.getImagen();
             second.putExtra("dia", dia);
             second.putExtra("tiempo", tiempo);
             second.putExtra("imagen", photo);
             startActivity(second);

            Data item = Data.get(position);
            Toast.makeText(getApplicationContext(), "Usted ha Selecciono el Dia " + item.getDia(), Toast.LENGTH_LONG).show();

            }

          }

        );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}