package Problema1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Problema1 {

    public static ArrayList<Atleta> Integrantes_Atletas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario

        while (!salir) {

            System.out.println("\nPractica N1  ------------------------------------------- [P1] \n");
            System.out.println("[1] Registro de Atleta");
            System.out.println("[2] Imprimir Atletas");
            System.out.println("[3] Salir");

            try {
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        registroatleta();
                        break;
                    case 2:
                        imprimiratletas();
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



    static void registroatleta(){
        boolean salir = false;
        int opcion;

        while(!salir){

            Scanner teclado = new Scanner(System.in);

            String nombre, apellido, pais, tipocarrera;
            int edad, uniforme, medallaoro, medallaplata, medallabronce;

            System.out.println("\n[ -  Resgistro de Atleta  ------------------------- ]");
            System.out.println("Ingrese los datos del Atleta");
            System.out.print("[ ] Nombre: "); nombre = teclado.nextLine();
            System.out.print("[ ] Apellido: "); apellido = teclado.nextLine();
            System.out.print("[ ] Edad: "); edad = teclado.nextInt(); teclado.nextLine();
            System.out.print("[ ] Pais: "); pais = teclado.nextLine();
            System.out.print("[ ] Tipo de Carrera: "); tipocarrera = teclado.nextLine();
            System.out.print("[ ] Uniforme: "); uniforme = teclado.nextInt();
            System.out.print("[ ] Medallas de Oro: "); medallaoro = teclado.nextInt();
            System.out.print("[ ] Medallas de Plata: "); medallaplata = teclado.nextInt();
            System.out.print("[ ] Medallas de Bronce: "); medallabronce = teclado.nextInt();

            Atleta Atleta = new Atleta(nombre, apellido, pais, edad, tipocarrera, uniforme, medallaoro, medallaplata, medallabronce);
            Integrantes_Atletas.add(Atleta);

            System.out.print(" - Registro de Atleta Exitoso - ");
            System.out.println("\n");

            salir = true;
        }
    }


    static void imprimiratletas(){
        /*
        for(Atleta atleta: Integrantes_Atletas){
            atleta.ToString();
        }
        */
        System.out.println("\n[ -  Atletas Registrados  ----------------------------- ]");
        for(int i = 0; i < Integrantes_Atletas.size(); i++) {
            System.out.println("[ ] Atleta N°"+(i+1)+":");
            System.out.println(Integrantes_Atletas.get(i).ToString());
        }

    }

}
