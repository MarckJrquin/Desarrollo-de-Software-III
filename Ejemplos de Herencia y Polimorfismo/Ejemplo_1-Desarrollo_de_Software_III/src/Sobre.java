class Sobrecarga{
    //Sobrecargando demoSobrec para un 3 parámetro int
    int Sobrec(int a, int b, int c){
        int s= a+b+c;
        return s;
    }
    //Sobrecargando demoSobrec para un 2 parámetro int
    int Sobrec(int a, int b){
        int s= a+b;
        return s;
    }
    //Sobrecargando demoSobrec para dos parámetros double
    double Sobrec(double a, double b){
        return a+b;
    }
}

class Sobre{
    public static void main(String[] args) {
        Sobrecarga sc= new Sobrecarga();
        double sumadouble;
        //Llamando todas las versiones de Sobrec

        System.out.println("Resultado de >Suma de tres numeros enteros:"+sc.Sobrec(2,4,5)+"\n");
        System.out.println("Resultado de >Suma de dos numeros enteros:"+sc.Sobrec(2,5)+"\n");
        sumadouble=sc.Sobrec(4.2,6.1);
        System.out.println("Resultado de suma de numeros decimales es: "+sumadouble);
    }
}