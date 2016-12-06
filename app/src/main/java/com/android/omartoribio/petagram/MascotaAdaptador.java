package com.android.omartoribio.petagram;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by CLDMS012 on 29/11/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {


    ArrayList<Mascota> mascotas;
    Activity activity;
    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }


    //Inflar el layout y lo pasara al viewholder para que el obtenta los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotaViewHolder(v);
    }


    //asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder contactoViewHolder, int position) {
      final Mascota mascota = mascotas.get(position);
         contactoViewHolder.imgFoto.setImageResource(mascota.getFoto());
        contactoViewHolder.tvNombreMascotaCV.setText(mascota.getNombre());
        contactoViewHolder.tvRaitingMascotaCV.setText("" + mascota.getRaiting());



        contactoViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  contador = (int)mascota.getRaiting();
                if(contador != 5){
                    contador++;
                    mascota.setRaiting(contador);
                    contactoViewHolder.tvRaitingMascotaCV.setText("" + contador);
                }
            }
        });

    }

    @Override
    public int getItemCount() {//CAntidad de elementos que contiene mi lista
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombreMascotaCV;
        private TextView tvRaitingMascotaCV;
        private ImageButton btnLike;
        private ImageButton  btnContadorLike;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto         = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreMascotaCV      = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvRaitingMascotaCV    = (TextView) itemView.findViewById(R.id.tvRaitingMascota);
            btnLike         = (ImageButton) itemView.findViewById(R.id.btnLike);
            btnContadorLike = (ImageButton) itemView.findViewById(R.id.btnContadorLike);
        }
    }

}
