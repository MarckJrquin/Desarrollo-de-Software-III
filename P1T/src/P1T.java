
class person{
    person(){
        System.out.println("hola");
    }
}

class student extends person{
    student(){
        super();
        System.out.println("ola");
    }
}


public class P1T {

    public static void main(String[] args) {
        student s = new student();
        System.out.println(s);
    }
}
