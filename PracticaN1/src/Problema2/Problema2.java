package Problema2;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Problema2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario

        while (!salir) {

            System.out.println("\nPractica N1  ------------------------------------------- [P2] \n");
            System.out.println("[1] Area de un Circulo");
            System.out.println("[2] Area de una Sector Circular");
            System.out.println("[3] Salir");

            try {
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        circulo();
                        break;
                    case 2:
                        sectorcircular();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println(" -- Solo números entre 1 y 3 --\n\n");
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
                Circulo areacir = new Circulo(radio);
                System.out.println("   El área del círculo es: " + df.format(areacir.calcularArea()) + "\n\n");
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("   Debes ingresar un número [0-9]\n");
                sn.next();
            }
        }
    }


    static void sectorcircular(){
        boolean salir = false;
        Scanner sn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\n\n-----------------------------------");
        System.out.println("\n[2] Opcion 2 | Area de un Sector Circular");
        double radio=0, angulo=0;

        while (!salir){
            System.out.print(" - Introduzca el radio: ");
            try {
                radio = sn.nextDouble();
                while (radio < 0) {
                    System.out.println("   Solo números positivos [!]\n");
                    System.out.print(" - Introduzca el radio nuevamente: ");
                    radio = sn.nextDouble();
                }
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("   Debes ingresar un número [0-9]\n");
                sn.next();
            }
        }

        salir = false;

        while (!salir){
            System.out.print(" - Introduzca el Angulo: ");
            try {
                angulo = sn.nextDouble();
                while (angulo < 0) {
                    System.out.println("   Solo números positivos [!]\n");
                    System.out.print(" - Introduzca la altura nuevamente: ");
                    angulo = sn.nextDouble();
                }
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("   Debes ingresar un número [0-9]\n");
                sn.next();
            }
        }

        SectorCircular areasec = new SectorCircular(radio,angulo);
        System.out.println("El área del Sector Circular es: " + df.format(areasec.calcularArea()) + "\n\n");

    }


}