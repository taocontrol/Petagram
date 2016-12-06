package com.android.omartoribio.petagram;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setTitle(null);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador(){
        MascotaAdaptador adadptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adadptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.chat_top_delire, " Cattito", 2));
        mascotas.add(new Mascota(R.drawable._horse, " Caballito", 0));
        mascotas.add(new Mascota(R.drawable.dalmatian_dog," Manchado",1));
        mascotas.add(new Mascota(R.drawable._spider," Peter parker",3));
        mascotas.add(new Mascota(R.drawable._rabbit," Bugs bunny",0));
    }

    public void MostrarMascotasfavoritas(View v){
        Intent intent = new Intent(MainActivity.this, DetalleMascota.class);
        startActivity(intent);
    }

}
