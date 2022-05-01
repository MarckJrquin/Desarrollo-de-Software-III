package Problema1;

public class Atleta extends Persona {
    private String tipocarrera;
    private int uniforme;
    private int medallaoro;
    private int medallaplata;
    private int medallabronce;

    public Atleta(String nombre, String apellido, String pais, int edad, String tipocarrera, int uniforme, int medallaoro, int medallaplata, int medallabronce) {
        super(nombre, apellido, pais, edad);
        this.tipocarrera = tipocarrera;
        this.uniforme = uniforme;
        this.medallaoro = medallaoro;
        this.medallaplata = medallaplata;
        this.medallabronce = medallabronce;
    }


    public String getTipocarrera() {
        return tipocarrera;
    }

    public int getUniforme() {
        return uniforme;
    }

    public int getMedallaoro() {
        return medallaoro;
    }

    public int getMedallaplata() {
        return medallaplata;
    }

    public int getMedallabronce() {
        return medallabronce;
    }

    /*
    public void mostrarDatos() {
        System.out.println("Datos del estudiante ingresados");
        System.out.println("[ ] Nombre: " + getNombre());
        System.out.println("[ ] Apellido: " + getApellido());
        System.out.println("[ ] Edad: " + getEdad());
        System.out.println("[ ] Pais: " + getPais());
        System.out.println("[ ] Tipo de Carrera: " + getTipocarrera());
        System.out.println("[ ] Uniforme: " + getUniforme());
        System.out.println("[ ] Uniforme: " + getUniforme());
    }
    */

    public String ToString(){
        return " - Nombre: "+getNombre()+
                "\n - Apellido: "+getApellido()+
                "\n - Edad: "+getEdad()+
                "\n - Pais: "+getPais()+
                "\n - Tipo de Carrera: "+getTipocarrera()+
                "\n - Uniforme: "+getUniforme()+
                "\n - Medallas de Oro: "+getMedallaoro()+
                "\n - Medallas de Plata: "+getMedallaplata()+
                "\n - Medallas de Bronce: "+getMedallabronce()+"\n";
    }

}
