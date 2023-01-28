package p2lab2_gabrielzelaya;

import java.awt.Color;

public class Casa {
    
    private int numCasa;
    private int numBloque;
    private Color color;
    private double ancho;
    private double largo;
    private int numBaños;
    private int numCuartos;
    private String estado;
    private String dueño;

    public Casa(int numCasa, int numBloque, Color color, double ancho, double largo, int numBaños, int numCuartos, String estado) {
        this.numCasa = numCasa;
        this.numBloque = numBloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.numBaños = numBaños;
        this.numCuartos = numCuartos;
        this.estado = estado;
    }

    public Casa() {
    }

    public int getNumCasa() {
        return numCasa;
    }

    public int getNumBloque() {
        return numBloque;
    }

    public Color getColor() {
        return color;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public int getNumCuartos() {
        return numCuartos;
    }

    public String getEstado() {
        return estado;
    }

    public String getDueño() {
        return dueño;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public void setNumBloque(int numBloque) {
        this.numBloque = numBloque;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public void setNumCuartos(int numCuartos) {
        this.numCuartos = numCuartos;
    }
    
    public void setEstado(int estado) {
        switch (estado){
            case 1-> this.estado = "Lista";
            case 2 -> this.estado = "En construcción";
            case 3 -> this.estado = "Construcción en espera";
            case 4 -> this.estado = "Espera para demoler";
        }
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
        
}
