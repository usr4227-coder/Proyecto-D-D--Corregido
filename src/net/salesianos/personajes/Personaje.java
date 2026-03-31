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
}
