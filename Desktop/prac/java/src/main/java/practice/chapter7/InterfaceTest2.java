package practice.chapter7;

public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());
        a.autoPlay(new C());
    }
}

class A2{
    void autoPlay(I i){
        i.play();
    }
}
interface I{
    public abstract void play();
}

class B2 implements I{
    public void play(){
        System.out.println("B2.play");
    }
}

class C implements I{
    @Override
    public void play() {
        System.out.println("C.play");
    }
}
