package practice.chapter6;


class Car2{
    String color;
    String gearType;
    int door;

    Car2(){
        this("white","auto",3);
    }

    Car2(String color){
        this(color,"auto",3);
    }

    Car2(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
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

class CarTest2 {

    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("red");
        Car2 c3 = new Car2("blue","auto",3);

        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());
        System.out.println("c3 = " + c3.toString());
    }
}
