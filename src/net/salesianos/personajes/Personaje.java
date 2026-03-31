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

    public void entrenar(int x) {
        if (x <= 0) {
            System.out.println("No se puede entrenar 0 o menos niveles.");
            return;
        }
        nivel = nivel + x;
    }

    public void descansar(int x) {
        if (x <= 0) {
            System.out.println("No se puede descansar 0 o menos puntos.");
            return;
        }
        energia = energia + x;
        if (energia > 100) {
            energia = 100;
        }
    }

    public void gastarEnergia(int x) {
        if (x <= 0) {
            System.out.println("No se puede gastar 0 o menos puntos.");
            return;
        }
        if (energia < 0) {
            energia = 0;
        }
    }

    public void mostrarInfo() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Energía: " + energia);
    }

    public static void mostrarPersonajes() {
        System.out.println("\nTotal personajes creados: " + totalPersonajes);
    }

}
