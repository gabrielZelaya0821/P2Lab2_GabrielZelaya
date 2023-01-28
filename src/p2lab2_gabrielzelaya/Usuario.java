package p2lab2_gabrielzelaya;

public class Usuario {
    public String nombre;
    public int edad;
    public String username;
    public String contraseña;

    public Usuario(String nombre, int edad, String username, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getUsername() {
        return username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Username: "+username;
    }
}
