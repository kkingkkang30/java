package practice.chapter7;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

class A3{
    void methodA(){
        I2 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I2 {
    public abstract void methodB();
}

class B3 implements I2{
    public void methodB(){
        System.out.println("B3.methodB");
    }

    @Override
    public String toString() {
        return "classB";
    }
}

class InstanceManager{
    public static I2 getInstance(){
        return new B3();
    }
}
