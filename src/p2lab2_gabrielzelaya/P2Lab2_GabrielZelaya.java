package p2lab2_gabrielzelaya;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class P2Lab2_GabrielZelaya {
    
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static boolean acceso = false;
    public static ArrayList inmuebles = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int menu;
        do{
            System.out.println("(1)Registro de Inmueble/Solar\n(2)Manejo de estados\n(3)LogIn/SignUp\n(4)Salir");
            menu = entrada.nextInt();
            switch (menu){
                case 1 -> registro();
                case 2 -> manejo();
                case 3 -> {
                    System.out.println("(1)LogIn\n(2)SignUp\n(3)LogOut");
                    int opcion = entrada.nextInt();
                    switch (opcion){
                        case 1 -> logIn();
                        case 2 -> signUp();
                        case 3 -> acceso = false;
                        default -> System.out.println("Número inválido");
                    }
                }
                case 4 -> System.out.println("Saliendo");
                default -> System.out.println("Número no es válido");
            }
        }while(menu!=4);
    }
    
    public static void registro(){
        Scanner entrada = new Scanner(System.in);
        int menu;
        System.out.println("(1)Crear\n(2)Listar\n(3)Modificar\n(4)Borrar\n(5)Vender");
        menu = entrada.nextInt();
        switch (menu){
            case 1 -> {
                if(acceso){
                    crear();
                }
            }
            case 2 -> listar();
            case 3 -> {
                if(acceso){
                    modificar();
                }
            }
            case 4 -> {
                if(acceso){
                    borrar();
                }
            }
            case 5 -> vender();
            default -> System.out.println("Número no es válido");
        }
    }
    
    public static void vender(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese que quiere vender: ");
        System.out.println("(1)Casa\n(2)Edificio\n(3)Solar");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1 -> venderCasa();
            case 2 -> venderEdificio();
            case 3 -> venderSolar();
            default -> System.out.println("Número no es válido");
        }
    }
    
    public static void venderCasa(){
        Scanner entrada = new Scanner(System.in);
        for (Object casa : inmuebles) {
            System.out.println(inmuebles.indexOf(casa)+"->"+casa);
        }
        System.out.println("¿Qué casa desea vender?");
        int posicion = entrada.nextInt();
        if (inmuebles.get(posicion) instanceof Casa casa){
            System.out.println("Ingrese el nombre del nuevo dueño: ");
            String nombre = entrada.nextLine();
            casa.setDueño(nombre);
        } else {
            System.out.println("No es una casa");
        }
    }
    
    public static void venderEdificio(){
        Scanner entrada = new Scanner(System.in);
        for (Object edificio : inmuebles) {
            System.out.println(inmuebles.indexOf(edificio)+"->"+edificio);
        }
        System.out.println("¿Qué edificio desea vender?");
        int posicion = entrada.nextInt();
        if (inmuebles.get(posicion) instanceof Edificio edificio){
            System.out.println("Ingrese el nombre del nuevo dueño: ");
            String nombre = entrada.nextLine();
            edificio.setDueño(nombre);
        } else {
            System.out.println("No es un edificio");
        }
    }
    
     public static void venderSolar(){
        Scanner entrada = new Scanner(System.in);
        for (Object solar : inmuebles) {
            System.out.println(inmuebles.indexOf(solar)+"->"+solar);
        }
        System.out.println("¿Qué solar desea vender?");
        int posicion = entrada.nextInt();
        if (inmuebles.get(posicion) instanceof Solar solar){
            System.out.println("Ingrese el nombre del nuevo dueño: ");
            String nombre = entrada.nextLine();
            solar.setDueño(nombre);
        } else {
            System.out.println("No es una casa");
        }
    }
    
    public static void borrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese que quiere borrar: ");
        System.out.println("(1)Casa\n(2)Edificio\n(3)Solar");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1 ->borrarCasa();
            case 2 ->borrarEdificio();
            case 3 ->borrarSolar();
            default -> System.out.println("Número no es válido");
        }
    }
    
    public static void borrarCasa(){
        Scanner entrada = new Scanner(System.in);
        for (Object casa : inmuebles) {
            System.out.println(inmuebles.indexOf(casa)+"->"+casa);
        }
        System.out.println("¿Qué casa desea borrar?");
        int posicion = entrada.nextInt();
        if (inmuebles.get(posicion) instanceof Casa){
            inmuebles.remove(posicion); 
        } else {
            System.out.println("No es una casa");
        }
    }
    
    public static void borrarEdificio(){
        Scanner entrada = new Scanner(System.in);
        for (Object edificio : inmuebles) {
            System.out.println(inmuebles.indexOf(edificio)+"->"+edificio);
        }
        System.out.println("¿Qué edificio desea borrar?");
        int posicion = entrada.nextInt();
        if (inmuebles.get(posicion) instanceof Edificio){
            inmuebles.remove(posicion); 
        } else {
            System.out.println("No es un edificio");
        }
    }
    
 public static void borrarSolar(){
        Scanner entrada = new Scanner(System.in);
        for (Object solar : inmuebles) {
            System.out.println(inmuebles.indexOf(solar)+"->"+solar);
        }
        System.out.println("¿Qué solar desea borrar?");
        int posicion = entrada.nextInt();
        if (inmuebles.get(posicion) instanceof Solar){
            inmuebles.remove(posicion); 
        } else {
            System.out.println("No es un solar");
        }
    }
    
    public static void listar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese que quiere listar: ");
        System.out.println("(1)Casa\n(2)Edificio\n(3)Solar");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1 ->{
                 for (Object inmueble : inmuebles) {
                    if(inmueble instanceof Casa){
                        System.out.println(inmuebles.indexOf(inmueble)+"->"+inmueble);
                    }
                }
            }
            case 2 ->{
                for (Object inmueble : inmuebles) {
                    if(inmueble instanceof Edificio){
                        System.out.println(inmuebles.indexOf(inmueble)+"->"+inmueble);
                    }
                }
            }
            case 3 ->{
                for (Object inmueble : inmuebles) {
                    if(inmueble instanceof Solar){
                        System.out.println(inmuebles.indexOf(inmueble)+"->"+inmueble);
                    }
                }
            }
        }     
    }
    
    public static void modificar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese que quiere listar: ");
        System.out.println("(1)Casa\n(2)Edificio\n(3)Solar");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1 -> modCasa();
            case 2 ->modEdificio();
            case 3 ->modSolar();
            default -> System.out.println("Número no es válido");
        }
    }
    
    public static void modSolar(){
        Scanner entrada = new Scanner(System.in);
        for (Object solar : inmuebles) {
            if (solar instanceof Solar) {
                System.out.println(inmuebles.indexOf(solar)+"->"+solar);
            }
        }
        System.out.println("Ingrese que solar desea acceder: ");
        int posicion = entrada.nextInt();
        System.out.println("Ingrese que quiere modificar: ");
        int modificar = entrada.nextInt();
        System.out.println("""
                           (1)Ancho(2)Largo
                           (3)Area""");
        switch (modificar){
            case 1 ->{
                if(inmuebles.get(posicion) instanceof Solar solar){
                    System.out.println("Ingrese el ancho: ");
                    double ancho = entrada.nextDouble();
                    solar.setAncho(ancho);
                    solar.setArea(ancho*solar.getLargo());
                }
            }
            case 2 ->{
                if(inmuebles.get(posicion) instanceof Solar solar){
                    System.out.println("Ingrese el largo: ");
                    double largo = entrada.nextDouble();
                    solar.setAncho(largo);
                    solar.setArea(largo*solar.getAncho());
                }
            }
            case 3 ->{
                if(inmuebles.get(posicion) instanceof Solar solar){
                    System.out.println("Ingrese el ancho: ");
                    double ancho = entrada.nextDouble();
                    solar.setAncho(ancho);
                }
            }
            default ->{
                System.out.println("Número no es válido");
            }
        }
    }
    
    public static void modEdificio(){
        Scanner entrada = new Scanner(System.in);
        for (Object edificio : inmuebles) {
            System.out.println(inmuebles.indexOf(edificio)+"->"+edificio);
        }
        System.out.println("Ingrese que edificio desea acceder: ");
        int posicion = entrada.nextInt();
        System.out.println("Ingrese que quiere modificar: ");
        int modificar = entrada.nextInt();
        System.out.println("""
                           (1)Numero de pisos(2)Cantidad de locales
                           (3)Direccion""");
        switch (modificar){
            case 1 -> {
                if(inmuebles.get(posicion) instanceof Edificio edificio){
                    System.out.println("Ingrese el numero de pisos: ");
                    int numPisos = entrada.nextInt();
                    edificio.setNumPisos(numPisos);
                }
            }
            case 2 -> {
                if(inmuebles.get(posicion) instanceof Edificio edificio){
                    System.out.println("Ingrese la cantidad de locales: ");
                    int numLocales = entrada.nextInt();
                    edificio.setCantidadLocales(numLocales);
                }
            }
            case 3 -> {
                if(inmuebles.get(posicion) instanceof Edificio edificio){
                    System.out.println("Ingrese la dirección: ");
                    String direccion = entrada.nextLine();
                    edificio.setDireccion(direccion);
                }
            }
            default -> System.out.println("Número no es válido");
        } 
    }
    
    public static void modCasa(){
        Scanner entrada = new Scanner(System.in);
        for (Object casa : inmuebles) {
            System.out.println(inmuebles.indexOf(casa)+"->"+casa);
        }
        System.out.println("Ingrese que casa desea acceder: ");
        int posicion = entrada.nextInt();
        System.out.println("Ingrese que quiere modificar: ");
        int modificar = entrada.nextInt();
        System.out.println("""
                           (1)Numero de casa(2)Numero de bloque
                           (3)Color (4)Ancho
                           (5)Largo (6)Numero de baños
                           (7)Numero de cuartos""");
        switch (modificar){
            case 1 -> {
                if(inmuebles.get(posicion) instanceof Casa casa){
                    System.out.println("Ingrese el numero de casa: ");
                    int numCasa = entrada.nextInt();
                    casa.setNumCasa(numCasa);
                }
            }
            case 2 ->{
                if(inmuebles.get(posicion) instanceof Casa casa){
                    System.out.println("Ingrese el numero de bloque: ");
                    int numBloque = entrada.nextInt();
                    casa.setNumBloque(numBloque);
                } 
            }
            case 3 ->{
                Color color = JColorChooser.showDialog(null, "Ingrese el nuevo Color: ", Color.yellow);
                if(inmuebles.get(posicion) instanceof Casa casa){
                    casa.setColor(color);
                }
            }
            case 4 ->{
                if(inmuebles.get(posicion) instanceof Casa casa){
                    System.out.println("Ingrese el ancho: ");
                    int ancho = entrada.nextInt();
                    casa.setAncho(ancho);
                } 
            }
            case 5 ->{
                if(inmuebles.get(posicion) instanceof Casa casa){
                    System.out.println("Ingrese el largo: ");
                    int largo = entrada.nextInt();
                    casa.setLargo(largo);
                } 
            }
            case 6 ->{
                if(inmuebles.get(posicion) instanceof Casa casa){
                    System.out.println("Ingrese el numero de baños: ");
                    int baños = entrada.nextInt();
                    casa.setNumBaños(baños);
                } 
            }
            case 7 ->{
                if(inmuebles.get(posicion) instanceof Casa casa){
                    System.out.println("Ingrese el numero de cuartos: ");
                    int cuartos = entrada.nextInt();
                    casa.setNumCuartos(cuartos);
                } 
            }
            default -> System.out.println("Número no es válido");
        }
    }
    
    public static void crear(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("(1)Casa\n(2)Edificio\n(3)Solar");
        int inmueble = entrada.nextInt();
        switch (inmueble){
            case 1 -> crearCasa();
            case 2 -> crearEdificio();
            case 3 -> crearSolar();
            default -> System.out.println("Número inválido");
        }
    }
    
    public static void crearCasa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número de casa: ");
        int numCasa = entrada.nextInt();
        System.out.println("Número de bloque: ");
        int numBloque = entrada.nextInt();
        Color color = JColorChooser.showDialog(null, "Escoga el color de la casa", Color.yellow);
        System.out.println("Ingrese el ancho de la casa: ");
        double ancho = entrada.nextDouble();
        System.out.println("Ingrese el largo de la casa: ");
        double largo = entrada.nextDouble();
        System.out.println("Ingrese el numero de baños: ");
        int baños = entrada.nextInt();
        System.out.println("ingrese el numero de cuartos: ");
        int cuartos = entrada.nextInt();
        System.out.println("Ingrese el estado de la casa: ");
        String estado = "Construcción en espera";
        Casa casa = new Casa(numCasa,numBloque,color,ancho,largo,baños,cuartos,estado);
        inmuebles.add(casa);
    }
    
    public static void crearEdificio(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de pisos: ");
        int numPisos = entrada.nextInt();
        System.out.println("Ingrese la cantidad de locales: ");
        int numLocales = entrada.nextInt();
        entrada = new Scanner(System.in);
        System.out.println("Ingrese la dirección: ");
        String direccion = entrada.nextLine();
        String estado = "Construcción en espera";
        Edificio edificio = new Edificio(numPisos,numLocales,direccion,estado);
        inmuebles.add(edificio);
    }
    
    public static void crearSolar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el ancho: ");
        double ancho = entrada.nextDouble();
        System.out.println("Ingrese el largo: ");
        double largo = entrada.nextDouble();
        String estado = "Construcción en espera";
        Solar solar = new Solar(ancho,largo,estado);
        inmuebles.add(solar);
    }
    
    public static void manejo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------Inmuebles----------");
        for (Object inmueble : inmuebles) {
            System.out.println(inmuebles.indexOf(inmueble)+"-> "+inmueble);
        }
        System.out.println("¿Qué inmueble desea acceder?");
        int opcion = entrada.nextInt();
        mostrarEstado(opcion);
        System.out.println("¿Desea cambiar el estado? s/n");
        char decision = entrada.next().toLowerCase().charAt(0);
        if(decision == 's'){
            System.out.println("(1)Lista(2)En construcción\n(3)Construcción en espera (4)Espera para demoler"); 
            System.out.println("¿A qué desea cambiar el estado?");
            int estado = entrada.nextInt();
            if (inmuebles.get(opcion) instanceof Casa casa){
                casa.setEstado(estado);
                System.out.println("Estado: "+casa.getEstado());
            } else if(inmuebles.get(opcion) instanceof Edificio edificio){
                edificio.setEstado(estado);
                System.out.println("Estado: "+edificio.getEstado());
            } else if(inmuebles.get(opcion) instanceof Solar solar){
                solar.setEstado(estado);
                System.out.println("Estado: "+solar.getEstado());
            } else {
                System.out.println("Número inválido");
            }
        }
    }
    
    public static void mostrarEstado(int opcion){
        if (inmuebles.get(opcion) instanceof Casa casa){
            System.out.println("Estado: "+casa.getEstado());
        } else if(inmuebles.get(opcion) instanceof Edificio edificio){
            System.out.println("Estado: "+edificio.getEstado());
        } else if(inmuebles.get(opcion) instanceof Solar solar){
            System.out.println("Estado: "+solar.getEstado());
        } else {
            System.out.println("Número inválido");
        }
    }
    
    public static void logIn(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su username: ");
        String username = entrada.next();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = entrada.next();
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) 
                    && usuario.getContraseña().equals(contraseña)) {
                System.out.println("Sesión iniciada correctamente");
                if (usuario.getUsername().equals("admin") 
                    && usuario.getContraseña().equals("admin1234")){
                    acceso = true;
                }
            } else {
                System.out.println("Usuario o contraseña incorrecto");
            }
        }
    }
    
    public static void signUp(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del usuario: ");
        String username = entrada.next();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = entrada.next();
        Usuario usuario = new Usuario(nombre,edad,username,contraseña);
        usuarios.add(usuario);
    }
}