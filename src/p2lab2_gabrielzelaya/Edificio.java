package p2lab2_gabrielzelaya;

public class Edificio {
    
    private int numPisos;
    private int cantidadLocales;
    private String direccion;
    private String estado;
    private String dueño;

    public Edificio(int numPisos, int cantidadLocales, String direccion, String estado) {
        this.numPisos = numPisos;
        this.cantidadLocales = cantidadLocales;
        this.direccion = direccion;
        this.estado = estado;
    }

    public Edificio() {
    }

    public int getNumPisos() {
        return numPisos;
    }

    public int getCantidadLocales() {
        return cantidadLocales;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public String getDueño() {
        return dueño;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public void setCantidadLocales(int cantidadLocales) {
        this.cantidadLocales = cantidadLocales;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
