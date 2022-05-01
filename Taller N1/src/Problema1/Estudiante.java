package Problema1;

public class Estudiante extends Persona {
    private String escuela;
    private int grado;
    private char salon;

    public Estudiante(String nombre, String apellido, String direccion, int edad, String escuela, int grado, char salon) {
        super(nombre, apellido, direccion, edad);
        this.escuela = escuela;
        this.grado = grado;
        this.salon = salon;
    }

    public String getEscuela() {
        return escuela;
    }

    public int getGrado() {
        return grado;
    }

    public char getSalon() {
        return salon;
    }

    public void mostrarDatos() {
        System.out.println("Datos del estudiante ingresados");
        System.out.println("[ ] Nombre: " + getNombre());
        System.out.println("[ ] Apellido: " + getApellido());
        System.out.println("[ ] Edad: " + getEdad());
        System.out.println("[ ] Direccion: " + getDireccion());
        System.out.println("[ ] Escuela: " + getEscuela());
        System.out.println("[ ] Grado: " + getGrado());
        System.out.println("[ ] Salon: " + getSalon());
    }

}
