class StaticDemo {
    int x; //Variable de instancia normal
    static int y; //Variable estática
    //Retornar la suma de la variable de instancia 'x'
    //y la variable estática 'y'
    int suma(){
        return x+y;
    }
}

class Test{
    public static void main(String[] args) {
        StaticDemo ob1=new StaticDemo();
        StaticDemo ob2=new StaticDemo();
        //Cada objeto tiene su propia copia de una variable de instancia
        ob1.x=10;
        ob2.x=12;
        System.out.println("Por supuesto, ob1.x y ob2.x son independientes.");
        System.out.println("ob1.x: "+ob1.x+"\nob2.x: "+ob2.x);
        System.out.println();
        //Cada objeto comparte una copia de una variable estática
        System.out.println("La variable estática 'y' es compartida.");
        StaticDemo.y=100;
        System.out.println("Cambio de StaticDemo.y a 100");
        System.out.println("ob1.suma(): "+ob1.suma());
        System.out.println("ob2.suma(): "+ob2.suma());
    }
} 