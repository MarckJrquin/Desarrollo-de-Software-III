/* Modificadores de acceso en la herencia
Los miembros privados no se heredan
Este programa marca error, se hara la corrección
en el salón de clases*/

class Poligono3 {

    private int ancho, altura;

    void set_atributos (int a, int b) {
        ancho=a; altura=b;
    }

    int get_altura( ){
        return altura;
    }

    int get_ancho( ){
        return ancho;
    }
}

class Rectangulo3 extends Poligono3 {

    public int area() {
        return (get_altura() * get_ancho());
        // marca error porque los atributos ancho y altura son privados
        // hacer corrección
        // para que no marque error, se llama el método get_ancho()
        // y get_altura() que son los métodos intermediarios
    }
}


public class Herencia3 {
    public static void main(String[] args) {
        Rectangulo3 recta;
        recta= new Rectangulo3();
        recta.set_atributos (4,5);
        System.out.print("AREA DEL RECTANGULO: " + recta.area() );
    }
}
