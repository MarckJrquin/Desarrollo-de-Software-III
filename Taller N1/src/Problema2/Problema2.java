package Problema2;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

// [1] Area de un Circulo
class Circulo {
    private double Radio;

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double valor)  {
        Radio = valor;
    }

    public double calcularArea() {
        return (getRadio() * getRadio() * 3.14159);
    }

    /*
    public double calculateDiameter() {
        return radius * 2;
    }

    public double calculateCircumference() {
        return calculateDiameter() * 3.14159;
    }
    */
}

// [2] Area de una Esfera
class Esfera extends Circulo {
    public double calcularArea() {
        return (4 * getRadio() * getRadio() * 3.14159);
    }
}


// [3] Area de un Cilindro
class Cilindro extends Circulo {
    private double Altura;

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double valor) {
        Altura = valor;
    }

    public double calcularAreaTotal() {
        return ((2 * 3.14159 * getRadio()) * (Altura + getRadio()));
    }

    /*

    public double calcularAreaLateral() {
        return 2 * 3.14159 * getRadio() * Altura;
    }

    public double calculateVolume() {
        return 3.14159 * getRadius() * getRadius() * height;
    }
    */
}


public class Problema2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario

        while (!salir) {

            System.out.println("\nTaller N1  ------------------------------------------ [P2]\n");
            System.out.println("[1] Area de un Circulo");
            System.out.println("[2] Area de una Esfera");
            System.out.println("[3] Area de un Cilindro");
            System.out.println("[4] Salir");

            try {
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        circulo();
                        break;
                    case 2:
                        esfera();
                        break;
                    case 3:
                        cilindro();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println(" -- Solo números entre 1 y 4 --\n\n");
                }
            } catch (InputMismatchException e) {
                System.out.println(" -- Debes insertar un número --\n\n");
                sn.next();
            }
        }
    }



    static void circulo() {
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\n\n-----------------------------------");
        System.out.println("[1] Opcion 1 | Area de un Circulo");
        Circulo areacir = new Circulo();

        while (!salir){
            System.out.print(" - Introduzca el radio: ");
            double radio;
            try {
                radio = sn.nextDouble();
                while (radio < 0) {
                    System.out.println("   Solo números positivos [!]\n");
                    System.out.print(" - Introduzca el radio nuevamente: ");
                    radio = sn.nextDouble();
                }
                areacir.setRadio(radio);
                System.out.println("   El área del círculo es: " + df.format(areacir.calcularArea()) + "\n\n");
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("   Debes ingresar un número [0-9]\n");
                sn.next();
            }
        }
    }


    static void esfera(){
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\n\n-----------------------------------");
        System.out.println("\n[2] Opcion 2 | Area de una Esfera");
        Esfera areaesf = new Esfera();

        while (!salir){
            System.out.print(" - Introduzca el radio: ");
            double radio;
            try {
                radio = sn.nextDouble();
                while (radio < 0) {
                    System.out.println("   Solo números positivos [!]\n");
                    System.out.print(" - Introduzca el radio nuevamente: ");
                    radio = sn.nextDouble();
                }
                areaesf.setRadio(radio);
                System.out.println("   El área del círculo es: " + df.format(areaesf.calcularArea()) + "\n\n");
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("   Debes ingresar un número [0-9]\n");
                sn.next();
            }
        }
    }


    static void cilindro(){
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\n\n-----------------------------------");
        System.out.println("\n[3] Opcion 3 | Area de un Cilindro");
        Cilindro areacil = new Cilindro();

        while (!salir){
            System.out.print(" - Introduzca el radio: ");
            double radio;
            try {
                radio = sn.nextDouble();
                while (radio < 0) {
                    System.out.println("   Solo números positivos [!]\n");
                    System.out.print(" - Introduzca el radio nuevamente: ");
                    radio = sn.nextDouble();
                }
                areacil.setRadio(radio);
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("   Debes ingresar un número [0-9]\n");
                sn.next();
            }
        }

        salir = false;

        while (!salir){
            System.out.print(" - Introduzca la altura: ");
            double altura;
            try {
                altura = sn.nextDouble();
                while (altura < 0) {
                    System.out.println("   Solo números positivos [!]\n");
                    System.out.print(" - Introduzca la altura nuevamente: ");
                    altura = sn.nextDouble();
                }
                areacil.setAltura(altura);
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("   Debes ingresar un número [0-9]\n");
                sn.next();
            }
        }

        System.out.println("El área del Cilindro es: " + df.format(areacil.calcularAreaTotal()) + "\n\n");

    }
}

