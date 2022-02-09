package practice.chapter7;

public class InnerEx2 {
    class InstanceInner2{}
    static class StaticInner2{}

    InstanceInner2 iv = new InstanceInner2();
    static StaticInner2 cv = new StaticInner2();

    static void staticMethod(){
        //static 메소드니까 인스턴스 멤버에 접근 불가
//      InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();

        InnerEx2 outer = new InnerEx2();
        InstanceInner2 obj1 = outer.new InstanceInner2();

    }

    void instanceMethod(){
        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();

    }

    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}

