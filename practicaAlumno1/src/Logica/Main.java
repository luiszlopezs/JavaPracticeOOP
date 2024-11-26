package Logica;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(12,"Naruto","Uzumaki");

        System.out.println("-----------------------------");
        System.out.println("el ID del alumno 2 es:"+ alumno2.getId());
        System.out.println("El nombre del alumno 2 es:"+ alumno2.getNombre());
        System.out.println("El apellido del alumno 2 es:"+ alumno2.getApellido());

        alumno1.setId(88);
        alumno1.setNombre("Sasuke");
        alumno1.setApellido("Uchiha");

        System.out.println("-----------------------------");
        System.out.println("el ID del alumno 1 es:"+ alumno1.getId());
        System.out.println("El nombre del alumno 1 es:"+ alumno1.getNombre());
        System.out.println("El nombre del alumno 1 es:"+ alumno1.getApellido());

        alumno2.setId(10);
        System.out.println("-----------------------------");
        System.out.println("el ID del alumno 2 es:"+ alumno2.getId());
        System.out.println("El nombre del alumno 2 es:"+ alumno2.getNombre());
        System.out.println("El apellido del alumno 2 es:"+ alumno2.getApellido());
    }
}
