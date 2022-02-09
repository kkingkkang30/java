package practice.chapter6;

import java.util.Arrays;

class Car{
    String color;
    String gearType;
    int door;

    Car(){}

    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}

class CarTest{
    public static void main(String[]args){

        Car c1= new Car();
        c1.color = "red";
        c1.door =4;
        c1.gearType ="auto";

        Car c2 = new Car("white","auto",3);

        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());
    }
}
