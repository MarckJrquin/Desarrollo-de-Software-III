package TG_CirCua;

import java.util.Scanner;

// Area de un Circulo -----------------------------------------------------------
class Circulo{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return (3.1416d * (radio*radio)); // A = π r²
    }
}

//Area de un cuadrado -----------------------------------------------------------
class Cuadrado extends Circulo{
    public double area() {
        return (super.area()/3.1415d);
    }
}

// Trabajo Grupal ---------------------------------------------------------------
public class TrabajoGrupalv2 {
    public static void main(String arg[]) {

        double valor;

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario
        while (!salir) {
            System.out.println("\nTrabajo Grupal N1  ------------------------------------------ \n");
            System.out.println("[1] Area de un Cuadrado");
            System.out.println("[2] Area de una Circulo");
            System.out.println("[3] Salir");
            System.out.print(" -  Escribe una de las opciones: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\n[ ] INTRODUZCA EL LADO DEL CUADRADO\n - ");
                    valor=sn.nextDouble();
                    Circulo area = new Cuadrado();
                    area.setRadio(valor);
                    System.out.println(" - Area del cuadrado: "+area.area());
                    break;
                case 2:
                    System.out.print("\n[ ] INTRODUZCA EL RADIO DEL CIRCULO\n - ");
                    valor=sn.nextDouble();
                    area = new Circulo();
                    area.setRadio(valor);
                    System.out.println(" - Area del circulo: "+area.area());
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println(" -- Solo números entre 1 y 3 --\n\n");
            }
        }
    }
}
