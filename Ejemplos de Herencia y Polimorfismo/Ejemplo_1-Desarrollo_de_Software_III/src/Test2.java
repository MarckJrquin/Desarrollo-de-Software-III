class StaticDemo2 {
    static int valor=1024; //Una variable estática
    //Un método estático
    static int valDiv2(){
        return valor/2;
    }
}

class Test2{
    public static void main(String[] args) {
        System.out.println("El valor es: "+StaticDemo2.valor);
        System.out.println("StaticDemo.valDiv2(): "+StaticDemo2.valDiv2());
        StaticDemo2.valor=4;
        System.out.println("El valor es: "+StaticDemo2.valor);
        System.out.println("StaticDemo.valDiv2(): "+StaticDemo2.valDiv2());
    }
}
