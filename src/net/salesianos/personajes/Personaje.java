package net.salesianos.personajes;

public class Personaje {

    private String nombre;
    private int nivel;
    protected int energia;
    public static int totalPersonajes = 0;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
        totalPersonajes++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

}
