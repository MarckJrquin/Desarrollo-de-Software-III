import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ParcialN1 {

    static Restaurante rest = new Restaurante();
    static Hotel hotel = new Hotel();

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        String opcion;

        while (!salir) {
            System.out.println("\n[ Parcial N°1 +++++++++++++++++++++++++++++++++++++++ ]");
            System.out.println("[1] Hotel");
            System.out.println("[2] Restaurante");
            System.out.println("[3] Registro");
            System.out.println("[4] Salir");
            System.out.print(" -  Escribe una de las opciones: ");
            opcion = sn.next();

            if(!(validarNumero(opcion,1,4)==-1)){
                switch (opcion){
                    case "1":
                        alquilerHotel();
                        break;
                    case "2":
                        reservaRestaurante();
                        break;
                    case "3":
                        registroVenta();
                        break;
                    case "4":
                        salir=true;
                        break;
                }
            }
        }
    }

    static void alquilerHotel(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        Scanner sn = new Scanner(System.in);
        boolean regresar = false;
        String cantHabitaciones;
        char opciona;

        while (!regresar){

            if(hotel.mostrarHabitaciones() <= 0 ){
                System.out.println(" -- No hay habitaciones disponibles :( --");
                break;
            }

            System.out.println("\nAlquiler de habitaciones  ----------------------------");
            System.out.println("[!] Habitaciones Disponibles: " + hotel.mostrarHabitaciones());

            System.out.print("\n    [ ] El Hotel tiene ascensor [s] o [n]: "); opciona=sn.next().charAt(0);
            if(opciona=='s' || opciona=='S'){
                hotel.hotelAscensor(true);
            } else if (opciona=='n' || opciona=='N') {
                hotel.hotelAscensor(false);
            }else{
                System.out.println("     -- Dato ingresado invalido, ingrese [s] o [n] --\n\n");
                regresar=true; break;
            }

            System.out.print("    [ ] Ingrese la cantidad a habitaciones a alquilar: ");
            cantHabitaciones = sn.next();
            if(!(validarNumero(cantHabitaciones,1, hotel.mostrarHabitaciones())==-1)){
                double costo = hotel.calcularPrecio(convertirStringEntero(cantHabitaciones));
                double itbms = hotel.calcularPrecio(convertirStringEntero(cantHabitaciones),0.07);
                System.out.println("     -  Costo de alquiler: "+formato1.format(costo)+" $");
                System.out.println("     -  itbms 7%: "+formato1.format(itbms)+" $");
                System.out.println("     -  Costo total: "+(formato1.format(costo+itbms))+" $");
            }
            regresar=true;
        }
    }

    static void reservaRestaurante(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        Scanner sn = new Scanner(System.in);
        boolean regresar = false;
        String cantSillas;
        char opciona;

        while (!regresar){

            if(rest.mostrarSillas() <= 1 ){
                System.out.println(" -- No es posible reservar :( --");
                break;
            }

            System.out.println("\nReserva de Mesa  -----------------------------------");
            System.out.println("[!] Sillas Disponibles: "+rest.mostrarSillas());

            System.out.print("\n    [ ] El Restaurante tiene ascensor [s] o [n]: "); opciona=sn.next().charAt(0);
            if(opciona=='s' || opciona=='S'){
                rest.restauranteAscensor(true);
            } else if (opciona=='n' || opciona=='N') {
                rest.restauranteAscensor(false);
            }else{
                System.out.println("     -- Dato ingresado invalido, ingrese [s] o [n] --\n\n");
                regresar=true; break;
            }

            System.out.print("    [ ] Ingrese la cantidad de sillas a reservar: ");
            cantSillas = sn.next();
            if(!(validarNumero(cantSillas,2, rest.mostrarSillas())==-1)){
                double costo = rest.calcularPrecio(convertirStringEntero(cantSillas));
                double itbms = rest.calcularPrecio(convertirStringEntero(cantSillas),0.07);
                System.out.println("     -  Costo de alquiler: "+formato1.format(costo)+" $");
                System.out.println("     -  itbms 7%: "+formato1.format(itbms)+" $");
                System.out.println("     -  Costo total: "+(formato1.format(costo+itbms))+" $");
            }
            regresar=true;
        }
    }

    static void registroVenta(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("\nRegistro de Venta  -----------------------------------");
        System.out.println("[ ] Hotel");
        System.out.println(" - Habitaciones alquiladas: "+hotel.totalHabitacionesAlquiladas());
        System.out.println(" - Habitaciones disponibles:  "+hotel.mostrarHabitaciones());
        System.out.println(" - Ganancias del Hotel: "+ formato1.format(hotel.ingresosTotales()) +" $");
        System.out.println("[ ] Restaurante");
        System.out.println(" - Sillas reservadas: "+rest.totalSillasAlquiladas());
        System.out.println(" - Sillas disponibles: "+rest.mostrarSillas());
        System.out.println(" - Ganancias del Restaurante:  "+rest.ingresosTotales()+" $");
    }


    public static int convertirStringEntero(String n){
        int num;
        num = Integer.parseInt(n);
        return num;
    }

    public static int validarNumero(String n, int min, int max){
        int num;
        try{
            num = Integer.parseInt(n);
            if (num>=min && num<=max) {
                return num;
            } else{
                System.out.println(" -- Ingrese solo números entre " + min + " y " + max + " --\n\n");
                return -1;
            }
        }catch (Exception e){
            System.out.println(" -- Debes insertar un número --\n\n");
            return -1;
        }
    }

}
