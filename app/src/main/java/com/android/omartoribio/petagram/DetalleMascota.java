package com.android.omartoribio.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by CLDMS012 on 30/11/2016.
 */
public class DetalleMascota extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_mascotas);



        ImageView imgEstrella = (ImageView) findViewById(R.id.imgFav);
        imgEstrella.setVisibility(View.INVISIBLE);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);
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
        mascotas.add(new Mascota(R.drawable._spider," Peter parker",9));
        mascotas.add(new Mascota(R.drawable.chat_top_delire, " Cattito", 9));
        mascotas.add(new Mascota(R.drawable._rabbit," Bugs bunny",8));
        mascotas.add(new Mascota(R.drawable._horse, " Caballito", 5));
        mascotas.add(new Mascota(R.drawable.dalmatian_dog," Manchado",5));
    }
}
