package practice.chapter7;

public class DefaultMethodTest {
    public static void main(String[] args) {

        Child3 c = new Child3();
        c.method1();
        c.method2();
        Myinterface.staticMethod();
        Myinterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements Myinterface, Myinterface2{
    public void method1(){
        System.out.println("Child3.method1");
    }

}

class Parent3{
    public void method1(){
        System.out.println("Parent.method1");
    }
}

interface Myinterface{
    default void method1(){
        System.out.println("Myinterface.method1");
    }

    default void method2(){
        System.out.println("Myinterface.method2");
    }
    static void staticMethod(){
        System.out.println("Myinterface.staticMethod");
    }
}

interface Myinterface2{
    default void method1(){
        System.out.println("Myinterface2.method1");
    }

    static void staticMethod(){
        System.out.println("Myinterface2.staticMethod");
    }
}


