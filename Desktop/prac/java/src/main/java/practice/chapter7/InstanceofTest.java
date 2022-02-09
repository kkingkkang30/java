package practice.chapter7;

class InstanceofTest {
    public static void main(String[] args) {

        FireEngine2 fe = new FireEngine2();
        if(fe instanceof FireEngine2){
            System.out.println("this is a fireengine instance");
        }

        if(fe instanceof Car2){
            System.out.println("this is a car instance");
        }

        if(fe instanceof Object){
            System.out.println("this is a Object instance");
        }

        System.out.println(fe.getClass().getName());
    }
}

class Car2{
}

class FireEngine2 extends Car2{

}
