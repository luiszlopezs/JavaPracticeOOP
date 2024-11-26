package Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    ////////////////Constructores///////////////7
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //////////////////////////////////////////////////////
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public void saberAprobado (double calificacion){
        if (calificacion >=6) {
            System.out.println("Aprobe la materia");
        }
        else {
            System.out.println("Uyy, no aprobe aaa");
        }
    }

    //////////////Setters y getters////////////////
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}

