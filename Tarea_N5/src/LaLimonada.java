import java.util.InputMismatchException;
import java.util.Scanner;

public class LaLimonada {
    public static void main(String[] args) {

        ConAzucar venta = new ConAzucar();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("\nTarea N°5 | La Limonada  ++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("[1] Venta");
            System.out.println("[2] Registro");
            System.out.println("[3] Salir");

            try{
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        boolean regresar = false;
                        int opcionv, vasos, cucharadas;

                        while (!regresar){

                            if(venta.mostrarVasos() <= 0 ){
                                System.out.println(" -- Ya no hay mas vasos :( --");
                                break;
                            }

                            System.out.println("\nVenta de Limonada  -----------------------------------");
                            System.out.println("[1] Sin Azucar | Precio: 0.45");
                            System.out.println("[2] Con Azucar | Precio: 0.50");
                            System.out.println("[3] Regresar");
                            System.out.println("\n    [!] Vasos Disponibles: "+venta.mostrarVasos());
                            System.out.println("    [!] Cucharadas Disponibles: "+venta.mostrarCucharadas());

                            try {
                                System.out.print("     -  Escribe una de las opciones: ");
                                opcionv = sn.nextInt();
                                switch (opcionv) {
                                    case 1:
                                        try{
                                            System.out.print("\n    [ ] Ingrese la cantidad a comprar: ");
                                            vasos = sn.nextInt();
                                            if(vasos > 0 && vasos <= venta.mostrarVasos()){
                                                System.out.println("     -  Costo total de venta: "+venta.calcularPrecio(vasos)+" $");
                                            }else{
                                                System.out.println("     -- La cantidad ingresada es invalida -- ");
                                            }
                                        }catch (InputMismatchException e){
                                            System.out.println("     -- Debes insertar un número --\n\n");
                                            sn.next();
                                        }
                                        break;
                                    case 2:
                                        try{
                                            if(venta.mostrarCucharadas() <= 0 ){
                                                System.out.println("     -- Ya no hay mas Azucar :c --");
                                                break;
                                            }
                                            System.out.print("\n    [ ] Ingrese la cantidad a comprar: ");
                                            vasos = sn.nextInt();
                                            if(vasos > 0 && vasos <= venta.mostrarVasos()){
                                                try{
                                                    System.out.println("    [ ] Ingrese la cantidad de cucacharadas de azucar");
                                                    cucharadas = sn.nextInt();
                                                    if(cucharadas > 0 && cucharadas <= 3){
                                                        System.out.println("     -  Costo total de venta: "+venta.calcularPrecio(vasos,cucharadas)+" $");
                                                    }else{
                                                        System.out.println("     -- La cantidad ingresada es invalida -- ");
                                                    }
                                                }catch (InputMismatchException e){
                                                    System.out.println("     -- Debes insertar un número --\n\n");
                                                    sn.next();
                                                }
                                            }else{
                                                System.out.println("     -- La cantidad ingresada es invalida -- ");
                                            }
                                        }catch (InputMismatchException e){
                                            System.out.println("     -- Debes insertar un número --\n\n");
                                            sn.next();
                                        }
                                        break;
                                    case 3:
                                        regresar = true;
                                        break;
                                    default:
                                        System.out.println("     -- Solo números entre 1 y 3 --\n\n");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("     -- Debes insertar un número --\n\n");
                                sn.next();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("\nRegistro de Venta de Limonadas  ----------------------");
                        System.out.println("[ ] Cantidad de Limonadas (Vasos) vendidas:  " + venta.total_vasos_utilizados());
                        System.out.println("    [ ] Cantidad de limonadas sin azucar vendidas: " + venta.total_Vasos_SinAzucar_vendidos());
                        System.out.println("    [ ] Cantidad de limonadas con azucar vendidas: " + venta.total_Vasos_ConAzucar_vendidos());
                        System.out.println("[ ] Cantidad de cucharadas de azucar usadas: " + venta.total_cucharadas_utilizados());
                        System.out.println("\n[ ] Ingresos Totales: " + venta.ganancias_totales());
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
