import java.util.InputMismatchException;
import java.util.Scanner;

public class ParcialN1 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Restaurante rest = new Restaurante();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        char opciona;

        while (!salir) {
            System.out.println("\n[ Parcial N°1 +++++++++++++++++++++++++++++++++++++++ ]");
            System.out.println("[1] Hotel");
            System.out.println("[2] Restaurante");
            System.out.println("[3] Registro");
            System.out.println("[4] Salir");

            try{
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt(); sn.nextLine();

                switch (opcion) {
                    case 1:
                        boolean regresar = false;
                        int habitaciones;

                        while (!regresar){

                            if(hotel.mostrarHabitaciones() <= 0 ){
                                System.out.println(" -- No hay habitaciones disponibles :( --");
                                break;
                            }

                            System.out.println("\nAlquiler de habitaciones  ----------------------------");
                            System.out.println("[!] Habitaciones Disponibles: "+hotel.mostrarHabitaciones());
                            try{
                                System.out.print("\n    [ ] El Hotel tiene ascensor [s] o [n]: ");
                                opciona=sn.next().charAt(0);
                                switch (opciona){
                                    case 's':
                                        hotel.hotelAscensor(true);
                                        break;
                                    case 'n':
                                        break;
                                    default:
                                        System.out.println("     -- Dato ingresado invalido, ingrese [s] o [n] --\n\n");
                                        regresar=true;
                                        break;
                                }

                                if(regresar==true){
                                    break;
                                }

                                System.out.print("    [ ] Ingrese la cantidad a habitaciones a alquilar: ");
                                habitaciones = sn.nextInt();
                                if(habitaciones > 0 && habitaciones <= hotel.mostrarHabitaciones()){
                                    double costo = hotel.calcularPrecio(habitaciones);
                                    double itbms = hotel.calcularPrecio(habitaciones,0.07);
                                    System.out.println("     -  Costo de alquiler: "+costo+" $");
                                    System.out.println("     -  itbms 7%: "+itbms+" $");
                                    System.out.println("     -  Costo total: "+(costo+itbms)+" $");
                                }else{
                                    System.out.println("     -- La cantidad ingresada es invalida -- ");
                                }
                            }catch (InputMismatchException e){
                                System.out.println("     -- Debes insertar un número --\n\n");
                                sn.next();
                            }
                            regresar=true;
                        }
                        break;
                    case 2:
                        boolean regresar2 = false;
                        int sillas;

                        while (!regresar2){

                            if(rest.mostrarSillas() <= 0 ){
                                System.out.println(" -- No hay sillas disponibles :( --");
                                break;
                            }

                            System.out.println("\nReserva de sillas  -----------------------------------");
                            System.out.println("[!] Sillas Disponibles: "+rest.mostrarSillas());

                            System.out.print("\n    [ ] El Restaurante tiene ascensor [s] o [n]: ");
                            opciona=sn.next().charAt(0);
                            switch (opciona){
                                case 's':
                                    rest.restauranteAscensor(true);
                                    break;
                                case 'n':
                                    break;
                                default:
                                    System.out.println("     -- Dato ingresado invalido, ingrese [s] o [n] --\n\n");
                                    regresar2=true;
                                    break;
                            }

                            if(regresar2==true){
                                break;
                            }

                            try{
                                System.out.print("\n    [ ] Ingrese la cantidad a sillas a reservar: ");
                                sillas = sn.nextInt();
                                if(sillas > 0 && sillas <= rest.mostrarSillas()){
                                    double costo = rest.calcularPrecio(sillas);
                                    double itbms = rest.calcularPrecio(sillas,0.07);
                                    System.out.println("     -  Costo de alquiler: "+costo+" $");
                                    System.out.println("     -  itbms 7%: "+itbms+" $");
                                    System.out.println("     -  Costo total: "+(costo+itbms)+" $");
                                }else{
                                    System.out.println("     -- La cantidad ingresada es invalida -- ");
                                }
                            }catch (InputMismatchException e){
                                System.out.println("     -- Debes insertar un número --\n\n");
                                sn.next();
                            }
                            regresar2=true;
                        }
                        break;
                    case 3:
                        System.out.println("\nRegistro de Venta de Limonadas  ----------------------");
                        System.out.println("[ ] Habitaciones alquiladas:  " + hotel.totalHabitacionesAlquiladas());
                        System.out.println("[ ] Habitaciones disponibles:  " + hotel.totalHabitacionesUtilizados());
                        System.out.println("[ ] Ganancias Hotel: "+ hotel.ganancias);
                        System.out.println("[ ] Sillas reservadas: "+ rest.totalSillasAlquiladas());
                        System.out.println("[ ] Sillas disponibles:  " + rest.totalSillasUtilizados());
                        System.out.println("[ ] Ganancias restaurante:  " + rest.ganancias);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println(" -- Solo números entre 1 y 4 --\n\n");
                }
            }catch (InputMismatchException e){
                System.out.println(" -- Debes insertar un número --\n\n");
                sn.next();
            }
        }
    }
}
