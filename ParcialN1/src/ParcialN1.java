import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class ParcialN1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("\n[ Parcial N°1 --------------------------------------- ]");
            System.out.println("[1] Hotel");
            System.out.println("[2] Restaurante");
            System.out.println("[3] Salir");

            try{
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt(); sn.nextLine();

                switch (opcion) {
                    case 1:

                        //Case 1 - - - - - - - - - - - - - - -
                        Hotel hotel = new Hotel();
                        boolean regresar = false, ascensor = false;
                        int opcionh, habitaciones;

                        while (!regresar){

                            if(hotel.mostrarHabitaciones() <= 0 ){
                                System.out.println(" -- No hay habitaciones disponibles :( --");
                                break;
                            }

                            System.out.println("\nAlquiler de habitaciones  ----------------------------");
                            System.out.println("\n[!] Habitaciones Disponibles: "+hotel.mostrarHabitaciones());
                            try{
                                System.out.print("\n    [ ] Ingrese la cantidad a habitaciones a alquilar: ");
                                habitaciones = sn.nextInt();
                                if(habitaciones > 0 && habitaciones <= hotel.mostrarHabitaciones()){
                                    System.out.println("     -  Costo total de venta: "+hotel.calcularPrecio(habitaciones)+" $");
                                }else{
                                    System.out.println("     -- La cantidad ingresada es invalida -- ");
                                }
                            }catch (InputMismatchException e){
                                System.out.println("     -- Debes insertar un número --\n\n");
                                sn.next();
                            }
                        }
                        break;
                        //Case 1 - - - - - - - - - - - - - - - - - - - - -
                    case 2:
                        //Case 2 - - - - - - - - - - - - - - - - - - - - -
                        Restaurante rest = new Restaurante();
                        boolean regresar2 = false, ascensorr = false;
                        int opcionr, sillas;

                        while (!regresar2){

                            if(rest.mostrarSillas() <= 0 ){
                                System.out.println(" -- No hay sillas disponibles :( --");
                                break;
                            }

                            System.out.println("\nReserva de sillas  -----------------------------------");
                            System.out.println("\n[!] Sillas Disponibles: "+rest.mostrarSillas());
                            try{
                                System.out.print("\n    [ ] Ingrese la cantidad a sillas a reservar: ");
                                sillas = sn.nextInt();
                                if(sillas > 0 && sillas <= rest.mostrarSillas()){
                                    System.out.println("     -  Costo total de reserva: "+rest.calcularPrecio(sillas)+" $");
                                }else{
                                    System.out.println("     -- La cantidad ingresada es invalida -- ");
                                }
                            }catch (InputMismatchException e){
                                System.out.println("     -- Debes insertar un número --\n\n");
                                sn.next();
                            }
                        }
                        break;
                        //Case 2 - - - - - - - - - - - - - - -

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
