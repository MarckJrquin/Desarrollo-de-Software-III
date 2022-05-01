import java.util.*;

public class problema_propuesto {

    public static ArrayList<publicacion> Registry_l_al = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario
        while (!salir) {
            System.out.println("\nProblema Propuesto | Compañia Editorial  ------------- \n");
            System.out.println("[1] Registro de Libros y Audio Libros");
            System.out.println("[2] Impresion de libros y Audio Libros");
            System.out.println("[3] Salir");
            System.out.print(" -  Escribe una de las opciones: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    boolean regresar = false;
                    int opcion2;
                    while (!regresar){
                        System.out.println("\nRegistro de Libro o Audio Libro  ------------- \n");
                        System.out.println("[1] Registrar de Libro");
                        System.out.println("[2] Registrar Audio Libro");
                        System.out.println("[3] Regresar");
                        try {
                            System.out.print(" -  Escribe una de las opciones: ");
                            opcion2 = sn.nextInt();
                            switch (opcion2) {
                                case 1:
                                    registro_libro();
                                    break;
                                case 2:
                                    registro_alibro();
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
                    impresion_a_al();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println(" -- Solo números entre 1 y 3 --\n\n");
            }
        }
    }

    static void registro_libro(){

        Scanner teclado = new Scanner(System.in);

        String titulo;
        double precio;
        int num_paginas;

        System.out.println("\n[ -  Resgistro de Libro  ------------------------- ]");
        System.out.println("Ingrese los datos del Atleta");
        System.out.print("[ ] Titulo: "); titulo = teclado.nextLine();
        System.out.print("[ ] Precio: "); precio = teclado.nextDouble();
        System.out.print("[ ] Numero de paginas: "); num_paginas = teclado.nextInt();

        publicacion pub = new publicacion(titulo, precio);
        publicacion libro = new libro(titulo,precio,num_paginas);

        Registry_l_al.add(pub);
        Registry_l_al.add(libro);
    }

    static void registro_alibro(){

        Scanner teclado = new Scanner(System.in);

        String titulo;
        double precio;
        int num_paginas;
        int t_reproduccion;

        System.out.println("\n[ -  Resgistro de Audio Libro  ------------------- ]");
        System.out.println("Ingrese los datos del Atleta");
        System.out.print("[ ] Titulo: "); titulo = teclado.nextLine();
        System.out.print("[ ] Precio: "); precio = teclado.nextDouble();
        System.out.print("[ ] Numero de paginas: "); num_paginas = teclado.nextInt();
        System.out.print("[ ] Tiempo de repoduccion (min): "); t_reproduccion = teclado.nextInt();

        publicacion cd = new cd(titulo,precio,num_paginas,t_reproduccion);

        Registry_l_al.add(cd);
    }

    static void impresion_a_al(){
        System.out.println("\n[ -  Libros y Audio Libros  ---------------------- ]");

        for(int i = 0; i < Registry_l_al.size(); i++) {
            System.out.println("[ ] N°"+(i+1)+":");
            System.out.println(Registry_l_al.get(i).toString());
        }
    }

}
