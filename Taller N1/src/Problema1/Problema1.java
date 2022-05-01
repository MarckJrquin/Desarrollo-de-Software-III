package Problema1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Problema1 {
    public static void main(String[] args) {
        /*
        Cree una clase Persona con atributos privados (nombre, dirección y edad) y otra Estudiante (Grado y Escuela).
        Cree un método que devuelva la pre-inscripción con el grado siguiente que debería cursar en 2023.
         */

        Scanner teclado = new Scanner(System.in);

        String nombre, apellido, direccion, escuela;
        int edad, grado;
        char salon;

        System.out.println("\nTaller N1  ------------------------------------------ [P1]\n");

        System.out.println("[ -  Resgistro de estudiante  ------------------------- ]");
        System.out.println("Ingrese los datos del estudiante");
        System.out.print("[ ] Nombre: "); nombre = teclado.nextLine();
        System.out.print("[ ] Apellido: "); apellido = teclado.nextLine();
        System.out.print("[ ] Edad: "); edad = teclado.nextInt(); teclado.nextLine();
        System.out.print("[ ] Direccion: "); direccion = teclado.nextLine();
        System.out.print("[ ] Escuela: "); escuela = teclado.nextLine();
        System.out.print("[ ] Grado: "); grado = teclado.nextInt();
        System.out.print("[ ] Salon: "); salon = teclado.next().charAt(0);

        Estudiante estudiante = new Estudiante(nombre, apellido, direccion, edad, escuela, grado, salon);

        System.out.println("\n");
        estudiante.mostrarDatos();

    }
}
