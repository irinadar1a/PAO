package examples;

public class B_Inheritance {
    public static void main(String[] args){
        A a = new B();
        System.out.println(a.i);

        //a.a();
        //a.b();
    }
}

class A {
    int i = 10;

    public void a(){
        System.out.println("a");
    }
}

class B extends A {
    int i = 20;

    public void b(){
        System.out.println("b");
    }
}

