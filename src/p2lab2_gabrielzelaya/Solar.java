package p2lab2_gabrielzelaya;

public class Solar {
    private double ancho;
    private double largo;
    private double area;
    private String dueño;
    private String estado;

    public Solar(double ancho, double largo, String estado) {
        this.ancho = ancho;
        this.largo = largo;
        area = ancho*largo;
        this.estado = estado;
    }

    public Solar() {
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea() {
        return area;
    }

    public String getDueño() {
        return dueño;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setEstado(int estado) {
        switch (estado){
            case 1-> this.estado = "Lista";
            case 2 -> this.estado = "En construcción";
            case 3 -> this.estado = "Construcción en espera";
            case 4 -> this.estado = "Espera para demoler";
        }
    }
}
