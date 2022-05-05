import java.util.Collections;
import java.util.Scanner;

public class ParcialN1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario

        while (!salir) {
            System.out.println("\n[ Parcial N°1 --------------------------------------- ]");
            System.out.println("[1] Hotel");
            System.out.println("[2] Restaurante");
            System.out.println("[3] Salir");
            System.out.print(" -  Escribe una de las opciones: ");
            opcion = sn.nextInt(); sn.nextLine();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println(" -- Solo números entre 1 y 4 --\n\n");
            }
        }
    }
}
