/* Modificadores de acceso en la herencia
Los miembros protegidos se heredan */

class Poligono2 {
    protected int ancho, altura;
    public void set_atributos (int a, int b) {
        ancho=a; altura=b;
    }
}

class Rectangulo2 extends Poligono2 {
    public int area() {
        return (ancho * altura);
    }
}

public class Herencia2 {
    public static void main(String[] args) {
        Rectangulo2 recta;
        recta= new Rectangulo2();
        recta.set_atributos (4,5);
        System.out.print("AREA DEL RECTANGULO: " + recta.area());
    }
}
