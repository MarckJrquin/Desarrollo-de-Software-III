import java.util.InputMismatchException;
import java.util.Scanner;

public class LaLimonada {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("\nTarea N°5 | La Limonada  -----------------------------");
            System.out.println("[1] Venta");
            System.out.println("[2] Registro");
            System.out.println("[3] Salir");

            try{
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        boolean regresar = false;
                        int opcion2;
                        while (!regresar){
                            System.out.println("\nVenta de Limonada  ---------------------------");
                            System.out.println("[1] Sin Azucar");
                            System.out.println("[2] Con Azucar");
                            System.out.println("[3] Regresar");
                            try {
                                System.out.print(" -  Escribe una de las opciones: ");
                                opcion2 = sn.nextInt();
                                switch (opcion2) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        regresar = true;
                                        break;
                                    default:
                                        System.out.println(" -- Solo números entre 1 y 3 --\n\n");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println(" -- Debes insertar un número --\n\n");
                                sn.next();
                            }
                        }
                        break;
                    case 2:

                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println(" -- Solo números entre 1 y 3 --\n\n");
                }

            }catch (InputMismatchException e){
                System.out.println(" -- Debes insertar un número --\n\n");
                sn.next();
            }
        }

    }

}
