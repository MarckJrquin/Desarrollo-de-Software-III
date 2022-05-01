package Problema1;

public class Persona {

    private String nombre;
    private String apellido;
    private String pais;
    private int edad;

    public Persona(String nombre, String apellido, String pais, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPais() {
        return pais;
    }

    public int getEdad() {
        return edad;
    }

}
