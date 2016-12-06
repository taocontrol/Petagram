package com.android.omartoribio.petagram;

/**
 * Created by CLDMS012 on 28/11/2016.
 */
public class Mascota {
    private int raiting;
    private int foto;
    private String nombre;

    public Mascota(int foto, String nombre, int raiting){
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
