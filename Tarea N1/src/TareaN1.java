import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Poligono {
    private int ancho;
    private int altura;

    void set_atributos (int a, int b) {
        setAncho(a); setAltura(b);
    }

    //Setter y Getter
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}

class Rectangulo extends Poligono {
    public int area() {
        return (getAncho() * getAltura());
    }
}

public class TareaN1 {
    /* Modificadores de acceso en la herencia
    Los miembros publicos y por defecto se heredan */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        Rectangulo recta;
        recta= new Rectangulo();
        System.out.print("Primer valor entero: ");
        int s1 = Integer.parseInt(br.readLine());
        System.out.print("Segundo valor entero: ");
        int s2 = Integer.parseInt(br.readLine());
        recta.set_atributos (s1,s2);
        System.out.print("AREA DEL RECTANGULO: " + recta.area() );
    }

}